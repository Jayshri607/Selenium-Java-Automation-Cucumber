package RunnerNew;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"appfeaturenew\\loginnew.feature"},
		glue= {"testsnew"}
		
		
		
		)






public class LoginRunnerNew extends AbstractTestNGCucumberTests
{

	

}
