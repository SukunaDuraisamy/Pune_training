package stepdef;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks
{
	@Before(order = 1)
	public void before()
	{
		System.out.println("Pre condition");
	}
	
	@After(order = 1)
	public void after()
	{
		System.out.println("Post condition");
	}
	
	@AfterStep
	public void afterstep()
	{
		System.out.println("After Step");
	}
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("Before Step");
	}
	
	@Before("@tag1 and @tag2")
	public void beforetag1() {
		System.out.println("Before Tag1");
	}
	
	@Before("@tag2")
	public void beforetag2() {
		System.out.println("Before Tag2");
	}
	
	@After("@tag1")
	public void aftertag1()
	{
		System.out.println("After Tag1");
	}
	
	@After("@tag2")
	public void aftertag2()
	{
		System.out.println("After Tag2");
	}
}