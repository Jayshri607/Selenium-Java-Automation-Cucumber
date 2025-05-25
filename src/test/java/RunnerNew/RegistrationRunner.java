package RunnerNew;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"appfeaturenew\\Registrartion.feature"},
		glue= {"testsnew"},
		plugin= {"pretty","html:target/reports/reports.html",
		"rerun:target/failedreports/failreport.txt"		
		}
		
		
		
		)



public class RegistrationRunner extends AbstractTestNGCucumberTests {

	

}
