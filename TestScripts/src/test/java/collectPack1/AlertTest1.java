package collectPack1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertTest1 {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://secure.smartbearsoftware.com/samples/testcomplete14/dialogs/#");
		driver.findElement(By.linkText("Show Confirm")).click();
		Alert alrt1 = driver.switchTo().alert();
		Thread.sleep(5000);
		System.out.println(alrt1.getText());
		alrt1.dismiss();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Show Prompt")).click();
		alrt1 = driver.switchTo().alert();
		System.out.println(alrt1.getText());
		alrt1.sendKeys("Siva");
		Thread.sleep(5000);
		alrt1.accept();
		Thread.sleep(5000);
		driver.quit();

	}

}
