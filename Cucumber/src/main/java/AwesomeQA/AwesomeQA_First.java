package AwesomeQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AwesomeQA_First 
{
	WebDriver dr;
	
	By phone = By.xpath("//*[contais(test(),'123456789']");
	By num = By.xpath("//div[@id='top-links']//ul[1]//li[1]//span[@class='hidden-xs hidden-sm hidden-md']");
	public void initpage(WebDriver dr)
	{
		this.dr = dr;
	}
	
	public String invoke()
	{
		 dr.get("https://awesomeqa.com/ui/");
		 String title = dr.getTitle();
		 System.out.println("Title: "+title);
		 return title;
	}
	
	public void phonedetail()
	{
		System.out.println("Get phone number");
//		String number = dr.findElement(num).getText();
//		System.out.println("Phone number: "+number);

	}
	
	public void end()
	{
		dr.close();
	}
}
