package collectPack2;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenPage {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.apsrtconline.in/oprs-web/");
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File target = new File("D:\\Page.bmp");
		FileHandler.copy(source, target);
		Thread.sleep(2000);
		driver.quit();
		

	}

}
