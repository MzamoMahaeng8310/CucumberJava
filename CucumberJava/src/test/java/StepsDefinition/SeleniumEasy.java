package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class SeleniumEasy {

	WebDriver driver = null;
	@Given(": Browser is open")
	public void browser_is_open() {
		System.out.println("inside step - Browser is open ");

		//create the relative path for the driver
		String projectpath = System.getProperty("user.dir");
		System.out.println("The project path is : " + projectpath);
		System.setProperty("webdriver.chrome.driver", projectpath + "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("the user in the demo home  page")
	public void the_user_in_the_superport_page() {
		System.out.println("inside step - the user in the superport page");
		driver.navigate().to("https://www.seleniumeasy.com/test/");
	}

	@When("the user clicks on the start practicing link")
	public void the_user_clicks_on_the_rugby_link() {
		System.out.println("inside step - the user clicks on the rugby link");
		driver.findElement(By.id("at-cv-lightbox-close")).click();
	}

	@Then("then the user is navigated to the BASIC EXAMPLES TO START WITH SELENIUM page")
	public void then_the_user_is_navigated_to_the_rugby_page() {
		System.out.println("inside step - then the user is navigated to the rugby page");
	driver.close();
	driver.quit();
	}


}
