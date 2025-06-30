package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class RegistrationPage extends BasePage{
	
	//Constructor
	WebDriver driver;
	public RegistrationPage(WebDriver driver)
	{
		super(driver);
	}
	
	//Locator
	@FindBy (xpath="//input[@id='id_gender1']") WebElement title; //Mr or Mrs title
	@FindBy (xpath="//input[@id='customer_firstname']") WebElement firstname; //first name
	@FindBy (xpath="//input[@id='customer_lastname']") WebElement lastname; //last name
	@FindBy (xpath="//input[@id='passwd']") WebElement password; //password
	
	@FindBy (xpath="//select[@id='days']") WebElement date; //date 
	Select dt=new Select(date);
	@FindBy (xpath="//select[@id='months']") WebElement month; //month 
	Select mn=new Select(month);
	@FindBy (xpath="//select[@id='years']") WebElement year; //year 
	Select yr=new Select(year);
	
	@FindBy (xpath="//span[normalize-space()='Register']") WebElement registerbtn;
	
	//Action methods
	
	public void title()
	{
		title.click();
	}
	
	public void firstName(String fname)
	{
		firstname.sendKeys(fname);
	}
	
	public void lastName(String lname)
	{
		lastname.sendKeys(lname);
	}
	public void setPassword(String pass)
	{
		password.sendKeys(pass);
	}
	public void selectDate()
	{
		dt.selectByIndex(3);
	}
	public void selectMonth()
	{
		mn.selectByIndex(3);
	}
	public void selectYear()
	{
		yr.selectByIndex(23);
	}
	
	public void registerbtn()
	{
		registerbtn.click();
	}
	
	
	
	
	
	

}
