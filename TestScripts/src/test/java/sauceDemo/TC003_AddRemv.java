package sauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC003_AddRemv {

	WebDriver driver = null;
	//Open Browser
	@BeforeTest
	public void openBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	driver.manage().window().maximize();
	}
	//Login
	@BeforeMethod
	public void Login() {
	driver.get("https://www.saucedemo.com/v1/index.html");
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	}
	//Add To Cart
	@Test(groups = {"Smoke", "Regression"}, invocationCount = 2)
	public void AddToCart() throws Exception {		
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();			
	}
	//Remove From Cart
	@Test(groups = {"Regression"}, enabled = false)
	public void AddRemoveCart() throws Exception {			
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();	
		Thread.sleep(5000);
	}
	//Logout
	@AfterMethod
	public void Logout() {
	driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
	driver.findElement(By.id("logout_sidebar_link")).click();
	}
	//Close Browser
	@AfterTest
	public void closeBrowser() throws Exception {
	Thread.sleep(2000);
	driver.quit();
	}
	
}
