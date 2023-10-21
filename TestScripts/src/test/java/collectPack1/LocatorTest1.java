package collectPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorTest1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/guest/home.do?h=1");
		//driver.findElement(By.id("searchBtn")).click();
		//driver.findElement(By.name("searchBtn")).click();
		//driver.findElement(By.className("chkavailabilityBtn")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div/form/div[1]/div/div[1]/input[9]")).click();
		//driver.findElement(By.xpath("//input[@value = 'Check Availability']")).click();
		driver.findElement(By.cssSelector("input[type = 'button']")).click();
		Thread.sleep(5000);
		driver.quit();

	}

}
