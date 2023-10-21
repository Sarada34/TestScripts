package collectPack2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTbl {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://datatables.net/extensions/select/examples/initialisation/checkbox.html");
		System.out.println("No: of tables using tagName: "	+driver.findElements(By.tagName("table")).size());
		System.out.println("No: of tables using Xpath: " +driver.findElements(By.xpath("//table")).size());
		System.out.println("No: of tables using CssSelector: " +driver.findElements(By.cssSelector("table")).size());
		
		System.out.println("Total no: of Rows: " +driver.findElements(By.xpath("//table[@id='example']//tr")).size());
		System.out.println("Total no: of Rows within the body: " +driver.findElements(By.xpath("//table[@id='example']//tbody//tr")).size());
		System.out.println("Total no: of Columns: " +driver.findElements(By.xpath("//table[@id='example']//thead//th")).size());
		
		//WebElement tabl = driver.findElement(By.id("example"));
		//WebElement tabl = driver.findElement(By.xpath("//table[@id='example']"));
		//System.out.println("Total table content: " +"\n"+ tabl.getText());
		
		WebElement row = driver.findElement(By.xpath("(//table[@id='example']//tr)[1]"));
		System.out.println("1st row content: "+row.getText());
		
		row = driver.findElement(By.xpath("(//table[@id='example']//tr)[4]"));
		System.out.println("4th row content: "+row.getText());
		
		row = driver.findElement(By.xpath("(//table[@id='example']//tr)[9]"));
		System.out.println("9th row content: "+row.getText());
		
		WebElement cell = driver.findElement(By.xpath("((//table[@id='example']//tr)[8]//td)[6]"));
		System.out.println("8th row 6th column content: "+cell.getText());
		
		WebElement position = driver.findElement(By.xpath("((//table[@id='example']//tr)[8]//td)[3]"));
		WebElement office = driver.findElement(By.xpath("((//table[@id='example']//tr)[8]//td)[4]"));
		System.out.println("Bruno Ash position is " +position.getText()+ " "+ "and his office is in "+office.getText());
		
		WebElement chkbx = driver.findElement(By.xpath("(//table[@id='example']//tr)[2]//td[1]"));
		chkbx.click();
		Thread.sleep(2000);
		chkbx = driver.findElement(By.xpath("(//table[@id='example']//tr)[4]//td[1]"));
		chkbx.click();
		Thread.sleep(2000);
		chkbx = driver.findElement(By.xpath("(//table[@id='example']//tr)[7]//td[1]"));
		chkbx.click();
		
		Thread.sleep(2000);
		driver.quit();

	}

}
