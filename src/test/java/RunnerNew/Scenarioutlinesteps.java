package RunnerNew;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


	@CucumberOptions(
			features= {"appfeaturenew\\Scenariooutline.feature"},
			glue= {"testsnew"}
			
			
			
			
			
			)
	
	public class Scenarioutlinesteps extends AbstractTestNGCucumberTests {


}
