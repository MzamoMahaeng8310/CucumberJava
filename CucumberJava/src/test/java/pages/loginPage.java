package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class loginPage {
	
	WebDriver driver;
	//as per naming convention in the team e.g. txt_username_login
	By txt_username = By.id("name");
	By txt_password = By.id("password");
	By btn_login = By.id("login");
	By btn_logout = By.id("logout");
	//create a constructor to force and instance of the driver 
	//it will be a method that has the same
	//the same session will be maintained and force the user to pass in the driver 
	public loginPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void enterUsername(String username) {
		
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password) {
		
		driver.findElement(txt_password).sendKeys(password);
		
	}

	public void clickLogin() {
		
		driver.findElement(btn_login).click();
	}
	
	public void CheckLogoutIsDiplayed() {
		
		driver.findElement(btn_logout).isDisplayed();
	}
	
	
	//or 1 function maybe created for a valid login 
	
	public void loginValidUser(String username, String password) {
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
	}
	
}
