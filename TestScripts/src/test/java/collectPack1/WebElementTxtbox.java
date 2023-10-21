package collectPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementTxtbox{

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/");
		driver.findElement(By.linkText("Apply New PAN Card")).click();
		WebElement txtDOB = driver.findElement(By.id("txtDOB"));
		txtDOB.sendKeys("01/01/1996");
		Thread.sleep(5000);
		System.out.println(txtDOB.getAttribute("value"));
		System.out.println(txtDOB.isEnabled());
		txtDOB.clear();
		Thread.sleep(5000);
		System.out.println(txtDOB.isEnabled());
		driver.quit();

	}

}
