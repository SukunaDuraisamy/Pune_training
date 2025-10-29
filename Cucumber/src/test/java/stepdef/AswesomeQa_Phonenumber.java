package stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import AwesomeQA.AwesomeQA_First;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AswesomeQa_Phonenumber {
	WebDriver dr;
	
	AwesomeQA_First obj1 = new AwesomeQA_First();
	@Given("In login page")
	public void in_login_page() {
		 dr = new FirefoxDriver();
		 obj1.initpage(dr);
//		 dr.get("https://awesomeqa.com/ui/");
	}
	
	@When("Display Phone number")
	public void display_phone_number() {
		obj1.phonedetail();
//		String Number = dr.findElement(By.xpath("//div[@id='top-links']//ul[1]//li[1]//span[@class='hidden-xs hidden-sm hidden-md']")).getText();
//		System.out.println("Phone Number: "+Number);
	}
	
	@Then("close the program")
	public void close_the_program() {
		obj1.end();
//	   System.out.println("Program Completed");
//	   dr.close();
	}
}