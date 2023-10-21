package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScrExec1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://emicalculator.net/");
		//WebElement txtloan = driver.findElement(By.id("loaninterest"));
		//txtloan.sendKeys("12.5");
		//txtloan.clear();
		//Actions act = new Actions(driver);
		//act.sendKeys(txtloan, "12.5");
		((JavascriptExecutor)driver).executeScript("document.getElementById('loaninterest').value='12.5';");
		Thread.sleep(5000);
		driver.quit();

	}

}
