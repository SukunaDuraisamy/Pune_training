package Runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src//test//java/Resource//Awesomeqa.feature"}, //location
				glue = {"stepdef"}, //step definition
				plugin = {"pretty","html:target/htmlreports/report.html"}//report 
//				tags = "@tag1"
		)

public class testRunner extends AbstractTestNGCucumberTests
{
	
}