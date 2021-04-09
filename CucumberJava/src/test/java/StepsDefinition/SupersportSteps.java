package StepsDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SupersportSteps {

	WebDriver driver = null;
	@Given(": Browser is open")
	public void browser_is_open() {
		System.out.println("inside step - Browser is open ");

		//create the relative path for the driver
		String projectpath = System.getProperty("user.dir");
		System.out.println("The project path is : " + projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		
	}

	@And("the user in the superport page")
	public void the_user_in_the_superport_page() {
		System.out.println("inside step - the user in the superport page");
	}

	@When("the user clicks on the rugby link")
	public void the_user_clicks_on_the_rugby_link() {
		System.out.println("inside step - the user clicks on the rugby link");
	}

	@Then("then the user is navigated to the rugby page")
	public void then_the_user_is_navigated_to_the_rugby_page() {
		System.out.println("inside step - then the user is navigated to the rugby page");
	}


}
