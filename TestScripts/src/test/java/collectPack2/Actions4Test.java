package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions4Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dtdc.in/");
		WebElement MouseAct = driver.findElement(By.xpath("(//a[@class='nav-link dropdown-toggle'])[2]"));
		Actions act = new Actions(driver);
		act.moveToElement(MouseAct).build().perform();
		driver.findElement(By.xpath("(//a[@class='dropdown-item font-weight-normal'])[10]")).click();
		Thread.sleep(20000);
		driver.quit();
		

	}

}
