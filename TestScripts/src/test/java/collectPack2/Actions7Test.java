package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions7Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		//lstCars.sendKeys("Volvo");
		Actions act = new Actions(driver);
		//act.sendKeys(lstCars, "Volvo").build().perform();   or
		//lstCars.sendKeys("Opel");
		
		act.keyDown(Keys.CONTROL).build().perform();
		act.click(driver.findElement(By.xpath("//option[text()='Volvo']"))).build().perform();
		act.click(driver.findElement(By.xpath("//option[text()='Opel']"))).build().perform();
		act.keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		
		driver.quit();
	}

}
