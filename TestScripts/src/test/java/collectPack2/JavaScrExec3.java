package collectPack2;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScrExec3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		WebElement tbl = driver.findElement(By.id("example"));
		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView()",tbl);
		File source = tbl.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Tbl.bmp");
		org.openqa.selenium.io.FileHandler.copy(source, dest);
		Thread.sleep(5000);
		driver.quit();

	}

}
