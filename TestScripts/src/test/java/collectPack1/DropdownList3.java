package collectPack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownList3 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select_multiple");
		driver.switchTo().frame("iframeResult");
		WebElement lstCars = driver.findElement(By.id("cars"));
		Select sel = new Select(lstCars);
		System.out.println(sel.isMultiple());
		System.out.println(sel.getOptions().size());
		sel.selectByIndex(0);
		Thread.sleep(2000);
		sel.selectByVisibleText("Opel");
		Thread.sleep(2000);
		sel.selectByValue("audi");
		Thread.sleep(2000);
		System.out.println(sel.getAllSelectedOptions().size());
		sel.deselectByIndex(3);
		Thread.sleep(2000);
		sel.deselectByValue("opel");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Volvo");
		//sel.deselectAll();
		Thread.sleep(2000);
		driver.quit();

	}

}
