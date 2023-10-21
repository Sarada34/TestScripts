package collectPack2;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScrExec5 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		//driver.navigate().to("https://mvnrepository.com/");
		((JavascriptExecutor)driver).executeScript("window.location='https://www.google.com/'");
		Thread.sleep(2000);
		System.out.println(((JavascriptExecutor)driver).executeScript("return document.title"));
		Thread.sleep(2000);
		System.out.println(((JavascriptExecutor)driver).executeScript("return document.URL"));
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("window.location='https://mvnrepository.com/'");
		Thread.sleep(2000);
		System.out.println(((JavascriptExecutor)driver).executeScript("return document.title"));
		Thread.sleep(2000);
		System.out.println(((JavascriptExecutor)driver).executeScript("return document.URL"));
		((JavascriptExecutor)driver).executeScript("history.back()");
		Thread.sleep(2000);
		((JavascriptExecutor)driver).executeScript("history.forward()");
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
