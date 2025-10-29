package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import AwesomeQA.AwesomeQA_Second;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AwesomeQA_registeration {
	WebDriver dr;
	
	AwesomeQA_Second obj1 = new AwesomeQA_Second();
	
	@Given("user is on the login page")
	public void user_is_on_the_login_page() {
	   dr = new FirefoxDriver();
	   obj1.initpage2(dr);
	   obj1.registeration();
//	   dr.get("https://awesomeqa.com/ui/");
//	   
//	   dr.findElement(By.xpath("//i[@class='fa fa-user']")).click();
//	   dr.findElement(By.xpath("//ul[@class='dropdown-menu dropdown-menu-right']//li[1]")).click();
	}
	
	@When("user enters valid Personal Details")
	public void user_enters_valid_username() {
		obj1.personalDetails();
//	    dr.findElement(By.id("input-firstname")).sendKeys("Abc");
//	    dr.findElement(By.id("input-lastname")).sendKeys("Def");
//	    dr.findElement(By.id("input-email")).sendKeys("bcdef@gmail.com");
//	    dr.findElement(By.id("input-telephone")).sendKeys("9632587410");
	}
	
	@When("user enters valid password")
	public void user_enters_valid_password() {
		obj1.password();
//	    dr.findElement(By.id("input-password")).sendKeys("147258");
//	    dr.findElement(By.id("input-confirm")).sendKeys("147258");
	}
	
	@And("I click on login")
	public void i_click_on_login() {
		obj1.login();
//	   dr.findElement(By.name("agree")).click();
//	   dr.findElement(By.xpath("//input[@value='Continue']")).click();
	}
	
	@Then("I'm in account login page")
	public void i_m_in_account_login_page() {
		obj1.end();
//		dr.findElement(By.xpath("//a[@class='btn btn-primary']")).click();
//	    System.out.println("Registration Completed");
//	    dr.close();
	}

}
