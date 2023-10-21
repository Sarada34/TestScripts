package collectPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementLstbx {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/newpancard.php");
		WebElement lstDOB = driver.findElement(By.id("proof_dob"));
		lstDOB.sendKeys("Passport");
		System.out.println(lstDOB.getAttribute("value"));
		System.out.println(lstDOB.isEnabled());
		Thread.sleep(5000);
		driver.quit();
	}

}
