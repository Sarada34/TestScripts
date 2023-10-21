package collectPack1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ForTest2 {

	public static void main(String[] args) {
		
		System.out.println("Code before For loop");
		for(int index=0;index<=2;index++) {
			System.out.println("Chrome browser execution");
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.com/");
			driver.quit();
		}
		System.out.println("Code after For loop");
		

	}

}
