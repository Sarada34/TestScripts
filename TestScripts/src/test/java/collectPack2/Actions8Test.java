package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions8Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		WebElement source = driver.findElement(By.id("fromPlaceName"));
		//source.sendKeys("HYDERABAD");
		Actions act = new Actions(driver);
		//act.sendKeys(source, "HYDERABAD").build().perform();
		act.sendKeys(source, "HYDERABAD").build().perform();
		Thread.sleep(2000);
		//act.sendKeys(Keys.ENTER).build().perform();
		act.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(2000);
		driver.quit();

	}

}
