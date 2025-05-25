package RunnerNew;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
		features= {"appfeaturenew\\Campaign.feature"},
				glue= {"testsnew","hooks"},
				plugin= {"pretty"},
				tags= "@campaign"
		
		)

public class CampaignRunner extends AbstractTestNGCucumberTests {

	
}
