package RunnerNew;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"appfeaturenew\\Profile.feature"},
		glue= {"testsnew"},
		plugin= {"pretty"}
	
		
		
		)

public class Runnerprofilenew extends AbstractTestNGCucumberTests
{

	
}
