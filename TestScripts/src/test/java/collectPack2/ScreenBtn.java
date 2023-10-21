package collectPack2;

import java.io.File;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenBtn {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		WebElement chkbtn = driver.findElement(By.id("searchBtn"));
		File source = chkbtn.getScreenshotAs(OutputType.FILE);
		File dest = new File("D:\\Btn.jpeg");
		org.openqa.selenium.io.FileHandler.copy(source, dest);
		Thread.sleep(5000);
		driver.quit();
	}

}
