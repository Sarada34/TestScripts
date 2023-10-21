package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Actions1Test {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.timesjobs.com/candidate/contact.html");
		WebElement uplResume = driver.findElement(By.name("resumeFile_basic"));
		Actions act = new Actions(driver);
		act.click(uplResume).build().perform();
		Thread.sleep(5000);
		driver.quit();
		

	}

}
