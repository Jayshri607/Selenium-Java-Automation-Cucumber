package testsnew;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepsNew {
	@Given("I am at the login page")
	
	public void prerequisite()
	{
		System.out.println("Given statement");

	}
@When ("I enter the credentials")

public void entercredentials()
{
	System.out.println("Entering the credentials");
}
@When("I click on login button")

public void loginbutton()

{
	System.out.println("Clicked on login button");
}
@Then ("I should be able to login" )

public void validatedlogin()
{
	System.out.println("login validated");
}
}
