package collectPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DowhileTest {

	public static void main(String[] args) {
		
		String browser = "chrome";
		 do{
			System.out.println("Chrome browser execution");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.quit();
		}while(browser.equals("firefox"));
		
		 System.out.println("Out of Loop");

	}

}
