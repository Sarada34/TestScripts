package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScrExec4 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/newpancard.php");
		WebElement txtDob = driver.findElement(By.id("txtDOB"));
		//((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.border='10px dotted blue';");
		//((JavascriptExecutor)driver).executeScript("document.getElementById('txtDOB').style.background='red';");
		
		((JavascriptExecutor)driver).executeScript("arguments[0].style.border='10px dotted blue';",txtDob);
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("arguments[0].style.background='red';",txtDob);
		
		Thread.sleep(5000);
		driver.quit();

	}

}
