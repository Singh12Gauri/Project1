package cucumberStepDefination;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	@Given("user is on login page")
	public void verifyLoginPage() {
		System.out.println("Hello World");
	}
	
	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("Hi World");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("How are World");
	}

	@Then("user is navigated to the homw page")
	public void user_is_navigated_to_the_homw_page() {
		System.out.println("Here the  World");
	}


}
