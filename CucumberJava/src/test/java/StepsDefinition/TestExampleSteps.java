package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import pages.TestProjectPOM;
import pages.loginPage;

public class TestExampleSteps {
	WebDriver driver = null;
	TestProjectPOM testProj;

	@Given("The user is on the TestProject Example Page")
	public void the_user_is_on_the_TestProject_Example_Page() {
		System.out.println("Inside Step : The user is on the TestProject Example Page");
		//how to set a relative path. 
		String  projectPath = System.getProperty("user.dir"); // this will get the  location of the project path
		System.out.println("Project path is: " + projectPath);
		//so the path of the chrome driver starts from src/test/resources. so delete the preceeding path
		//provide the path for the chromedriver.exe. change to forward slash. replace the backslash
		System.setProperty("webdriver.chrome.driver",projectPath+  "/src/test/resources/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); // implicit wait for 30 seconds
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // wait for the page to load or time it out
		driver.manage().window().maximize();// to run in full screen
		driver.navigate().to("https://example.testproject.io/web/");
		driver.findElement(By.id("name")).sendKeys("koos");
		driver.findElement(By.id("password")).sendKeys("12345");
		driver.findElement(By.id("login")).click();

		String pageTitle = driver.getTitle();
		System.out.println("The page title : "+ pageTitle);
	}

	@And("the TestProject Page is verified")
	public void the_TestProject_Page_is_verified() {
		System.out.println("Inside step : the TestProject Page is verified");
		String  pageTest = "Community Powered Test Automation";
		driver.getPageSource().contains(pageTest);
	}

	@When("^The (.*) downdown value is selected$")
	public void the_country_downdown_value_is_selected(String country) {
		System.out.println("Inside step : The country downdown value is selected");
		testProj = new TestProjectPOM(driver);
		testProj.selectCountry(country);
		//Select drpCountry = new Select(driver.findElement(By.id("country")));
		//drpCountry.selectByVisibleText(country);
	}

	@And("^The (.*) is entered$")
	public void the_address_is_entered(String address) {
		System.out.println("Inside Step : The address is entered ");
		testProj.enterAddress(address);
		//driver.findElement(By.id("address")).sendKeys(address);
	}

	@And("^Enter the (.*) address$")
	public void the_email_address_in_entered(String email) {
		System.out.println("Inside Step : The email address in entered");
		testProj.enterEmail(email);
		//driver.findElement(By.id("email")).sendKeys(email);
	}

	@And("^The user enters the (.*)$")
	public void the_phoneNumber_is_entered(String phonenum) {
		System.out.println("Inside Step : The phoneNumber is entered ");
		testProj.enterPhoneNumber(phonenum);
		//driver.findElement(By.id("phone")).sendKeys(phonenum);
	}

	@And("the Save button is clicked")
	public void the_Save_button_is_clicked() {
		System.out.println("Inside step : the Save button is clicked");
		testProj.saveInputs();
		//driver.findElement(By.id("save")).click();
	}

	@Then("the entry is saved")
	public void the_entry_is_saved() {
		System.out.println("Inside Step : the entry is saved");
		driver.getPageSource().contains("Saved");
	}



}
