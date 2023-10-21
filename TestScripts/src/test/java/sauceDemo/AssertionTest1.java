package sauceDemo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest1 {

	WebDriver driver = null;
	@Test
	public void AssertTest() {
		
		SoftAssert sart = new SoftAssert();
		sart.assertNull(driver);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		sart.assertNotNull(driver);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String expValue = "Google";
		System.out.println(expValue);
		String actualValue = driver.getTitle();
		System.out.println(actualValue);
		//Assert.assertEquals(actualValue, expValue);
		sart.assertEquals(actualValue, expValue);
		driver.quit();
		sart.assertAll();
	}
	
}
