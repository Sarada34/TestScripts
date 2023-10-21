package collectPack3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WinTest1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
		driver.manage().window().maximize();
		driver.get("https://www.cypress.io/");
		driver.findElement(By.partialLinkText("Log In")).click();
		
		Set<String> st = driver.getWindowHandles();
		List<String> lst = new ArrayList<String>(st);
		driver.switchTo().window(lst.get(1));
		
		driver.findElement(By.xpath("(//span[@class='pull-left'])[3]")).click();
		WebElement txtEm = driver.findElement(By.id("sso-discovery"));
		txtEm.sendKeys("TechG.com");
		Thread.sleep(5000);
		driver.quit();
		
	}

}
