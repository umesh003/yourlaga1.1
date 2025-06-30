package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage{
	
	//Constructor
	WebDriver driver;
	public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locator
	@FindBy (xpath="//a[normalize-space()='Sign in']") WebElement signInbtn; //signin btn
	
	@FindBy (xpath="//input[@id='email_create']") WebElement emailadd; //email address field
	
	@FindBy (xpath="//span[normalize-space()='Create an account']") WebElement createbtn; //create an account button

	//Action methods
	
	public void signinbtn()
	{
		signInbtn.click();
	}
	
	public void emailfield(String email)
	{
		emailadd.sendKeys(email);
	}
	
	public void createbtn()
	{
		createbtn.click();
	}
	
	
	
	
	
	

}
