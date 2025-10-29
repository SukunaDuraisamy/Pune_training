package stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login1_userinput {
	WebDriver dr = new FirefoxDriver();
	@Given("The Login page is displayed")
	public void the_login_page_is_displayed() {
		dr.get("https://www.saucedemo.com/");
		System.out.println("Login is successfull");
	}
	@When("The User enters valid {string} and {string}")
	public void the_user_enters_valid_and(String uname, String pswd) {
		dr.findElement(By.id("user-name")).sendKeys(uname);
		dr.findElement(By.id("password")).sendKeys(pswd);
		System.out.println("Enter user credentials");
	}
	@When("The User clicks on login button")
	public void the_user_clicks_on_login_button() {
		dr.findElement(By.id("login-button")).click();
		   System.out.println("Clicked the login button");
	}
	@Then("The Product page is displayed")
	public void the_product_page_is_displayed() {
		String title = dr.findElement(By.xpath("//div[@class='app_logo']")).getText();
		String actualtitle = dr.getTitle();
		if(title.equals(actualtitle))
		{
		System.out.println("Website closed");
	    dr.close();
		}
	}
}