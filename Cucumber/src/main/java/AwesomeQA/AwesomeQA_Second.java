package AwesomeQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeQA_Second {
	WebDriver dr;
	By fname = By.id("input-firstname");
	By lname = By.id("input-lastname");
	By email = By.id("input-email");
	By number = By.id("input-telephone");
	
	By pswd = By.id("input-password");
	By cpswd = By.id("input-confirm");
	
	By cbox = By.name("agree");
	By Continue = By.xpath("//input[@value='Continue']");
	
	By fcontinue = By.xpath("//a[@class='btn btn-primary']");
	public void initpage2(WebDriver dr)
	{
		this.dr = dr;
	}
	
	public String registeration()
	{
		System.out.println("Registration Page");
		dr.get("https://awesomeqa.com/ui/index.php?route=account/register");
		String title = dr.getTitle();
		System.out.println("Title of the page: " +title);
		return title;
	}
	
	public void personalDetails()
	{
		System.out.println("Personal Details");
		dr.findElement(fname).sendKeys("Abc");
		dr.findElement(lname).sendKeys("Def");
		dr.findElement(email).sendKeys("email06@gmail.com");
		dr.findElement(number).sendKeys("7894561203");
	}
	
	public void password()
	{
		System.out.println("Password");
		dr.findElement(pswd).sendKeys("123456");
		dr.findElement(cpswd).sendKeys("123456");
	}
	
	public void login()
	{
		System.out.println("Login");
		dr.findElement(cbox).click();
		dr.findElement(Continue).click();
	}
	
	public void end()
	{
		System.out.println("End of program");
		dr.findElement(fcontinue).click();
		dr.close();
	}
}
