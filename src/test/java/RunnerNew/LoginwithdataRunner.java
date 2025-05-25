package RunnerNew;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;



	@CucumberOptions(
			
			features= {"appfeaturenew\\loginwithdata.feature"},
			glue= {"testsnew"},
			plugin= {"pretty"}
			
			)
	
	public class LoginwithdataRunner extends AbstractTestNGCucumberTests {
	}


