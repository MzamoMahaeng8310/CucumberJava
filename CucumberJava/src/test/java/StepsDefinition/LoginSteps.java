package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//https://youtu.be/4e9vhX7ZuCw?list=PLhW3qG5bs-L_mFHirOLEYJ7X2rIXu8SR2&t=1640
public class LoginSteps {
	@Given("user is on login page")
	public void use_is_on_login_page() {
	System.out.println("inside step - user in on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		System.out.println("inside step -user enters username and password");
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside step -clicks on login button");
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		System.out.println("inside step -user is navigated to the home page");
	}


}
