package testsnew;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"appfeaturenew\\PlaceOrder.feature"},
		glue= {"testsnew"},
		plugin= {"pretty"}
		
		
		)

public class OrderConfirmaionrunner extends AbstractTestNGCucumberTests{

	
}
