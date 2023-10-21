package cucumberFiles;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef1 {

	WebDriver driver = null;
	
	@Before
	@Given("open the browser and enter the application URL")
	public void open_the_browser_and_enter_the_application_url() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(5));
	    driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(5));
	    driver.manage().window().maximize();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("enter the userName,passWord in the given fields")
	public void enter_the_user_name_pass_word_in_the_given_fields() {
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}
	
	@When("enter the {string},{string} in the given fields")
	public void enter_the_in_the_given_fields(String userName, String passWord) {
		driver.findElement(By.name("username")).sendKeys(userName);
	    driver.findElement(By.name("password")).sendKeys(passWord);
	    
	}

	@When("click on Login")
	public void click_on_login() {
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("verify the homepage display")
	public void verify_the_homepage_display() {
	    WebElement dashbd = null;
	    dashbd = driver.findElement(By.xpath("//h6[text()='Dashboard']"));
	    Assert.assertNotNull(dashbd);
	    
	}

	@Then("click on Logout")
	public void click_on_logout() {
	    driver.findElement(By.xpath("(//img[@alt='profile picture'])[1]")).click();
	    driver.findElement(By.linkText("Logout")).click();
	}
	@After
	@Then("close browser")
	public void close_browser() throws Exception {
	   Thread.sleep(5000);
	   driver.quit();
	}
	
	//Add Employee
	
	@When("click on PIM")
	public void click_on_pim() {
		driver.findElement(By.xpath("//span[text()='PIM']")).click();
	}
	@When("click on Add Employee button")
	public void click_on_add_employee_button() {
	    driver.findElement(By.linkText("Add Employee")).click();
	}
	@Then("enter {string},{string} and click on Save")
	public void enter_and_click_on_save(String firstName, String lastName) {
	    driver.findElement(By.name("firstName")).sendKeys(firstName);
	    driver.findElement(By.name("lastName")).sendKeys(lastName);
	    driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).clear();
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	}
	
	//Edit Employee
	
	@When("click on Employee List button")
	public void click_on_employee_list_button() {
	    driver.findElement(By.linkText("Employee List")).click();
	}
	@Then("enter {string} and click on Search")
	public void enter_and_click_on_search(String stringHint) {
	    driver.findElement(By.xpath("(//input[@placeholder='Type for hints...'])[1]")).sendKeys(stringHint);
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Then("click on Edit")
	public void click_on_edit() {
	    driver.findElement(By.xpath("(//button[@type='button'])[6]")).click();
	}
	@Then("enter the employee id and click on Save")
	public void enter_the_employee_id_and_click_on_save() {
	    driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys("1456");
	    driver.findElement(By.xpath("(//button[@type='submit'])[2]")).click();
	}
	
	//Delete Employee
	
	@Then("click on Delete and click on Yes,Delete button")
	public void click_on_delete_and_click_on_yes_delete_button() throws Exception {
	   driver.findElement(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-action-space'])[1]")).click();
	   Thread.sleep(2000);
	   //driver.findElement(By.xpath("(//button[@type='button'])[8]")).click();
	   WebElement del = driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--label-danger orangehrm-button-margin']"));
	   del.click();
	}

}
