package core;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import helper.ExcelHelper2;

public class TempFile extends BaseScript{
	
	@Test(dataProvider = "getTestdata()")
	public void addToCart(String userName, String passWord) throws Exception {	
		
		//Login
		driver.get("https://www.saucedemo.com/v1/index.html");
		driver.findElement(By.id("user-name")).sendKeys(userName);
		driver.findElement(By.id("password")).sendKeys(passWord);
		driver.findElement(By.id("login-button")).click();
		
		//Add to cart
		driver.findElement(By.xpath("(//button[text()='ADD TO CART'])[1]")).click();
		
		//Remove from cart
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='REMOVE']")).click();
		
		//Logout
		driver.findElement(By.xpath("//div[@class='bm-burger-button']")).click();
		driver.findElement(By.id("logout_sidebar_link")).click();
	
	}
	
	@DataProvider(name = "getTestdata()")
	public String[][] getTestdata() throws Exception {
		
		return ExcelHelper2.excelHelp("D:\\NewXlsx.xlsx", "Sheet2");
		
	}
	
	
}
		

