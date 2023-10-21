package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions2Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://api.jquery.com/dblclick/");
		driver.switchTo().frame(0);
		WebElement clrBox = driver.findElement(By.tagName("div"));
		Actions act = new Actions(driver);
		act.doubleClick(clrBox).build().perform();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		driver.quit();
	}

}
