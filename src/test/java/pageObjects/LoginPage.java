package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
	
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locator
	@FindBy (xpath="//a[normalize-space()='Sign in']") WebElement singin;
	@FindBy (xpath="//input[@id='email']") WebElement emailadd;
	@FindBy (xpath="//input[@id='passwd']") WebElement password;
	
	@FindBy (xpath="//span[normalize-space()='Sign in']") WebElement signinBT;
	
	//Action method
	public void signinlink()
	{
		singin.click();
	}
	
	public void emailfield(String email)
	{
		emailadd.sendKeys(email);
	}
	public void passwordfield(String pass)
	{
		password.sendKeys(pass);
	}
	
	public void signinbutton()
	{
		signinBT.click();
	}
	
}
