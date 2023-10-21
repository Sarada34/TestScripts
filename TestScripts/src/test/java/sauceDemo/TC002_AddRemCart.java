package sauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC002_AddRemCart {

	@Test
	public static void AddRemoveCart() throws Exception {		
		//Open Browser
				WebDriverManager.chromedriver().setup();
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
				driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
				driver.manage().window().maximize();
				
				//Login
				driver.get("https://www.saucedemo.com/v1/index.html");
				driver.findElement(By.id("user-name")).sendKeys("standard_user");
				driver.findElement(By.id("password")).sendKeys("secret_sauce");
				driver.findElement(By.id("login-button")).click();
				
				//Add To Cart
				driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
				
				//Remove From Cart
				Thread.sleep(2000);
				driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
				
				//Logout
				driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
				driver.findElement(By.id("logout_sidebar_link")).click();
				
				//Close Browser
				Thread.sleep(2000);
				driver.quit();
	}
}
