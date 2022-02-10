package stepdefintion;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {

	@Given("i want to launch browser")
	public void i_want_to_launch_browser() {
		System.out.println("Lauch Browser");
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I enter <username> and <password> in user textBox")
	public void i_enter_username_and_password_in_user_textBox() {
		System.out.println("user name  Browser");
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("I enter <password> in pass textBox")
	public void i_enter_password_in_pass_textBox() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("enter Submit button")
	public void enter_Submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Given("broser with username and password")
	public void broser_with_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
	

@When("I enter <username> in user textBox")
public void i_enter_username_in_user_textBox() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
}
