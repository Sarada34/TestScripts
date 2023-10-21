package collectPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownList1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://electoralsearch.eci.gov.in/");
		WebElement lstState = driver.findElement(By.id("stateID"));
		Select sel = new Select(lstState);
		System.out.println(sel.isMultiple());
		lstState.sendKeys("Goa");
		Thread.sleep(5000);
		lstState.sendKeys("Assam");
		Thread.sleep(5000);
		driver.quit();
		

	}

}
