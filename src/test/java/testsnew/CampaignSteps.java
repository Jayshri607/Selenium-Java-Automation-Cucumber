package testsnew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CampaignSteps {

	@Given("user should be at campaign page")
	public void user_should_be_at_campaign_page() {
	   System.out.println("Given statement");
	}

	@When("user clciks on create campaign button")
	public void user_clciks_on_create_campaign_button() {
		System.out.println("User clicked on create button");	   
	}

	@When("user enters the deatils")
	public void user_enters_the_deatils() {
	    System.out.println("User entered the details");
	}

	@Then("campaign should get created")
	public void campaign_should_get_created() {
		System.out.println("Campaign created");
	   
	}
	@When("user clicks on update button")
	public void user_clicks_on_update_button() {
	   System.out.println("User clicked on update button");
	}

	@When("user update the information")
	public void user_update_the_information() {
	    System.out.println("User update the info");
	}

	@Then("updated the information")
	public void updated_the_information() {
	    System.out.println("successfully updated the information");
	}

	@When("user clicks on delete button")
	public void user_clicks_on_delete_button() {
		System.out.println("User clicked on  delete button");
	    
	}

	@Then("campaign should get deleted")
	public void campaign_should_get_deleted() {
		System.out.println("Campaign deleted");
	    
	}




}
