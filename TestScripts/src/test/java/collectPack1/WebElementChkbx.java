package collectPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementChkbx {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/newpancard.php");
		WebElement cbTC = driver.findElement(By.id("agreeproof"));
		Thread.sleep(5000);
		System.out.println(cbTC.isSelected());
		cbTC.click();
		Thread.sleep(5000);
		System.out.println(cbTC.isSelected());
		Thread.sleep(5000);
		driver.quit();

	}

}
