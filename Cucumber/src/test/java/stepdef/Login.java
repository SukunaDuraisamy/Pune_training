package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login {
	
	WebDriver dr = new FirefoxDriver();
	
	@Given("Login page is displayed")
	public void login_page_is_displayed() {
		
		dr.get("https://www.saucedemo.com/");
		System.out.println("Login is successfull");
	    
	}
	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {
		dr.findElement(By.id("user-name")).sendKeys("standard_user");
		dr.findElement(By.id("password")).sendKeys("secret_sauce");
		System.out.println("Enter user credentials");
	}
	@When("User clicks on login button")
	public void user_clicks_on_login_button() {
	   dr.findElement(By.id("login-button")).click();
	   System.out.println("Clicked the login button");
	}
	@Then("Product page is displayed")
	public void product_page_is_displayed() {
		System.out.println("Website closed");
	    dr.close();
	}
}