package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class TestProjectPOM {
	
	protected WebDriver driver;
	
	private By txt_country = By.id("country");
	private By txt_address = By.id("address");
	private By txt_email = By.id("email");
	private By txt_phone = By.id("phone");
	private By btn_save = By.id("save");
	
	//constructor 
	
	public TestProjectPOM(WebDriver driver)
	{
		this.driver = driver;
		if(! driver.getTitle().equals("TestProject Demo"))
		{
			throw new IllegalStateException("This is not the Test Project Demo Page.This is the :" + driver.getCurrentUrl());
		}
		
	}
	
	public void selectCountry(String country)
	{
		Select drpCountry = new Select(driver.findElement(txt_country));
		drpCountry.selectByVisibleText(country);
	}
	
	public void enterAddress(String address)
	{
		
		driver.findElement(txt_address).sendKeys(address);
	}
	
	public void enterEmail(String email)
	
	{
		
		driver.findElement(txt_email).sendKeys(email);
	}
	
	public void enterPhoneNumber(String phoneNumber)
	{
		
		driver.findElement(txt_phone).sendKeys(phoneNumber);
	}
	
	public void saveInputs()
	{
		driver.findElement(btn_save).click();
	}
}
