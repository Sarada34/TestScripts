package collectPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class IfTest {

	public static void main(String[] args) {
		
		System.out.println("Code before If block");
		String browser = "chrome";
		//System.out.println(browser.equals("chrome"));
		if(browser.equals("chrome")) {
			System.out.println("Chrome browser execution");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.quit();
		}
		System.out.println("Code after If block");
		
	}

}
