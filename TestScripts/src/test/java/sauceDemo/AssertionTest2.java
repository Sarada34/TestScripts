package sauceDemo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionTest2 {

	@org.testng.annotations.Test
	public void testButton() throws Exception {
		WebDriver driver = null;
		SoftAssert sart = new SoftAssert();
		sart.assertNull(driver);
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		sart.assertNotNull(driver);
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/newpancard.php");
		Thread.sleep(5000);
		boolean status = driver.findElement(By.id("rblCategory_0")).isSelected();
		sart.assertTrue(status);
		driver.quit();
		sart.assertAll();
}
}
