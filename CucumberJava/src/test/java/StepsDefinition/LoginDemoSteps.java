package StepsDefinition;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.cucumber.java.en.*;

public class LoginDemoSteps {
//	WebDriver driver = null;
//
//	@Given("browser is open")
//	public void browser_is_open() {
//
//
//		System.out.println("Inside Step - browser is open");
//
//		//how to set a relative path. 
//		String  projectPath = System.getProperty("user.dir"); // this will get the  location of the project path
//		System.out.println("Project path is: " + projectPath);
//		//so the path of the chrome driver starts from src/test/resources. so delete the preceeding path
//		//provide the path for the chromedriver.exe. change to forward slash. replace the backslash
//		System.setProperty("webdriver.chrome.driver",projectPath+  "/src/test/resources/drivers/chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); // implicit wait for 30 seconds
//		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS); // wait for the page to load or time it out
//		driver.manage().window().maximize();// to run in full screen
//
//	}
//
//	@And("user in on login page")
//	public void user_in_on_login_page() {
//		driver.navigate().to("https://example.testproject.io/web/");
//
//	}
//
//	@When("^user enters (.*) and (.*)$") // regular expression from the feature file
//	//also its important to add the ^ cap and $ dollar sign as this step refers to feature parameter.
//	public void user_enters_user_name_and_password(String username,String password) throws InterruptedException {
//		driver.findElement(By.id("name")).sendKeys(username);
//		driver.findElement(By.id("password")).sendKeys(password);
//		
//		Thread.sleep(3000);
//
//	}
//
//	@And("user clicks on login")
//	public void user_clicks_on_login() {
//		driver.findElement(By.id("login")).click();
//	}
//	@Then("navigate the user to the home page")
//	public void navigate_the_user_to_the_home_page() throws Exception {
//
//		driver.findElement(By.id("logout")).isDisplayed();
//		Thread.sleep(2000);
//		driver.close();
//		driver.quit();
//
//	}


}
