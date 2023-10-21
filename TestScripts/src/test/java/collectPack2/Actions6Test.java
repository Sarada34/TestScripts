package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions6Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.goibibo.com/");
		driver.findElement(By.xpath("//span[@class = 'logSprite icClose']")).click();
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.PAGE_UP).build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.END).build().perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.HOME).build().perform();
		Thread.sleep(5000);
		driver.quit();

	}

}
