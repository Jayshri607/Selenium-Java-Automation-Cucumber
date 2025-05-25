package testsnew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenariooutlinesteps {

	@Given("I have logged inn application")
	public void i_have_logged_inn_application() {
		System.out.println("Given statement background");
	   
	}

	@Given("I am at home")
	public void i_am_at_home() {
	    System.out.println("At home page");
	}

	@Given("user in signup page")
	public void user_in_signup_page() {
		System.out.println("Signup page");
	    
	}

	@When("user enters name as {string} on form")
	public void user_enters_name_as_on_form(String name) {
		System.out.println("Name is :"+name);
	    
	}

	@When("User select gender as {string}")
	public void user_select_gender_as(String gender) {
		System.out.println("Gender is :" +gender);
	    
	}

	@When("user select slot number as {int}")
	public void user_select_slot_number_as(Integer int1) {
		System.out.println("Slot number is: " +int1);
	    
	}

	@Then("user gets created")
	public void user_gets_created() {
		System.out.println("User created");
	   
	}




}
