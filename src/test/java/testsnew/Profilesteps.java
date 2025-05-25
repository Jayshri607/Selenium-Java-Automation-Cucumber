package testsnew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Profilesteps {
	@Given("I have logged into application")
	public void i_have_logged_into_application() {
		System.out.println("I have logged in");
	    
	}

	@Given("I am at home page")
	public void i_am_at_home_page() {
		System.out.println("I am at home page");
	   
	}

	@When("I click on add  buttonn")
	public void i_click_on_add_buttonn() {
	    System.out.println("Clicked on add button");
	}

	@When("I enter the dataa")
	public void i_enter_the_dataa() {
		System.out.println("Entering the data");
	    
	}

	@Then("Profilee should get created")
	public void profilee_should_get_created() {
		System.out.println("Profile created");
	    
	}

	@When("I click on edit button")
	public void i_click_on_edit_button() {
		System.out.println("Clicked on edit button");
	   
	}

	@When("I update the details")
	public void i_update_the_details() {
	    System.out.println("Updated the details");
	}

	@Then("Profile should get updated")
	public void profile_should_get_updated() {
	   System.out.println("Profile updated");
	}

	@When("I click on delete button")
	public void i_click_on_delete_button() {
	   System.out.println("Clicked on delete button");
	}

	@Then("Profile get deleted")
	public void profile_get_deleted() {
	    System.out.println("Profile deleted");
	}




	

}
