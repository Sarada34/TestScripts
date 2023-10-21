package collectPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfelseTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		System.out.println("Code before Ifesle");
		String browser = "chrome";
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
		}else {
			System.out.println("Firefox execution");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
		System.out.println("Code after Ifelse block");
	
	}

}
