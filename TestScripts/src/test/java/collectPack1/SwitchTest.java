package collectPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		System.out.println("Code before Switch block");
		String browser = "chrome";
		switch (browser) {
		case "chrome":
			System.out.println("Chrome browser execution");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.out.println("Firefox browser execution");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			System.out.println("Edge browser execution");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid Input");
			break;
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
		
		System.out.println("Code after Switch block");
	}

}
