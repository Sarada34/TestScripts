package collectPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementRdbtn {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.thepancard.com/newpancard.php");
		WebElement rbArmy = driver.findElement(By.id("rblCategory_1"));
		System.out.println(rbArmy.isSelected());
		Thread.sleep(5000);
		rbArmy.click();
		Thread.sleep(5000);
		System.out.println(rbArmy.isSelected());
		driver.quit();
	}

}
