package collectPack2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScrExec2 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.tsrtconline.in/oprs-web/");
		((JavascriptExecutor)driver).executeScript("document.getElementById('searchBtn').click();");
		Thread.sleep(5000);
		driver.quit();
	}

}
