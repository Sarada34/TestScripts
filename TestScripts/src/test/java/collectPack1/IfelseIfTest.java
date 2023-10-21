package collectPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfelseIfTest {

	public static void main(String[] args) {
		
		WebDriver driver = null;
		System.out.println("Code before IfelseIf block");
		String browser = "chrome";
		if(browser.equals("chrome")) {
			System.out.println("Chrome browser execution");
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			
			
		}else if(browser.equals("firefox")) {
			System.out.println("Firefox browser execution");
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
			
		}else if(browser.equals("edge")){
			System.out.println("Edge browser execution");
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			
		}else {
			System.out.println("Some other browsers");
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.quit();
		System.out.println("Code after IfelseIf block");
	}

}
