package StepsDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;


public class GoogleSearchSteps {
	
	WebDriver driver = null;
	
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("Inside Step - Browser is open");
		
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
	
	}
	

	@And("user is on google seach page")
	public void user_is_on_google_seach_page() {
		System.out.println("Inside Step - user is on google seach page");
		driver.navigate().to("https://google.com");
	}

	@When("use enters  text in the search box")
	public void use_enters_text_in_the_search_box() throws Exception {
		System.out.println("Inside Step - use enters  text in the search box");
		driver.findElement(By.name("q")).sendKeys("Automation Step By Step");
		Thread.sleep(2000); // add some wait commands in milliseconds so this is 2 seconds;
	}

	@And("hits enter")
	public void hits_enter() throws Exception {
		System.out.println("Inside Step - hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000); // add some wait commands in milliseconds so this is 2 seconds;
	}
	

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		System.out.println("Inside Step - user is navigated to search results");
		driver.getPageSource().contains("Online Courses");
		driver.close();
		driver.quit();
	}
}
