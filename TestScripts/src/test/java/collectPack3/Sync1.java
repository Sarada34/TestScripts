package collectPack3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sync1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		driver.get("https://my.microfocus.com/?_ga=2.256628169.391134407.1697085826-63667322.1697085826");
		driver.findElement(By.partialLinkText("login")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofMinutes(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("username")));
		WebElement txtUsername = driver.findElement(By.id("username"));
		Thread.sleep(10000);
		txtUsername.sendKeys("SriRam");
		Thread.sleep(5000);
		driver.quit();

	}

}
