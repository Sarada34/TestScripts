package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions9Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		WebElement source = driver.findElement(By.id("fromPlaceName"));
		source.sendKeys("Hyderabad");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text()='HYDERABAD-AIRPORT-RGIA-PICKUP POINT-D']")).click();
		WebElement dataPicker = driver.findElement(By.id("txtJourneyDate"));
		dataPicker.click();
		Thread.sleep(2000);
		//WebElement date = driver.findElement(By.linkText("14"));
		WebElement date = driver.findElement(By.xpath("(//a[text()='14'])[1]"));
		Thread.sleep(2000);
		//date = driver.findElement(By.xpath("(//a[text()='14'])[2]"));
		Thread.sleep(2000);
		date.click();
		Thread.sleep(5000);
		driver.quit();
	}

}
