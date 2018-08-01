package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginNewTourStepDef {
	
	private WebDriver driver;
	
	@Given("^user is on login page of newtours$")
	public void user_is_on_login_page_of_newtours() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pdc4-training.pdc4\\DevOps\\cucumber-skeleton-project-1.2.0.1\\cucumber-java-skeleton-1.2.0.1\\Resources\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
	}

	@When("^user enters valid login credentials$")
	public void user_enters_valid_login_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
	    
	}

	@Then("^user can able to Login$")
	public void user_can_able_to_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}  
	
	@When("^user enters Invalid login credentials$")
	public void user_enters_Invalid_login_credentials() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("userName")).sendKeys("xxy");
		driver.findElement(By.name("password")).sendKeys("Invalid");
		driver.findElement(By.name("login")).click();
		Thread.sleep(1000);
	}

	@Then("^user can not able to Login$")
	public void user_can_not_able_to_Login() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		//Assert.assertEquals("Find a Flight: Mercury Tours:", driver.getTitle());
	}

}
