package sauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC004_Parameter {

	private WebDriver driver = null;
	
	//Open Browser
	@Parameters({"Brow"})
	@BeforeTest()
	public void openBrowser(@Optional("chrome") String browser) {
		
		switch (browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid option");
			break;
		}
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "getTestdata")
	public void AddToCart(String userName,String passWord) throws Exception {		
				
				//Login
				driver.get("https://www.saucedemo.com/v1/index.html");
				driver.findElement(By.id("user-name")).sendKeys(userName);
				driver.findElement(By.id("password")).sendKeys(passWord);
				driver.findElement(By.id("login-button")).click();
				
				//Add To Cart
				driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
				
				//Logout
				driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
				driver.findElement(By.id("logout_sidebar_link")).click();
	}	
	
	@DataProvider(name = "getTestdata")
	public String[][] getTestdata() {
		String[][] data = {
				{"standard_user","secret_sauce"},
				{"problem_user","secret_sauce"}
		};
		return data;
	}
				
	//Close Browser
	@AfterTest
	public void closeBrowser() throws Exception {
			Thread.sleep(2000);
			driver.quit();
	}
		

}
