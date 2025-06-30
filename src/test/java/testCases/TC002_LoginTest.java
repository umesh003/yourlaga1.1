package testCases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.LoginPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass{
	
	@Test
	public void loginTest() throws InterruptedException
	{
		LoginPage lp= new LoginPage(driver);
		lp.signinlink();
		lp.emailfield("umeshr.rasal003@gmail.com");
		lp.passwordfield("Ummu@0023");
		lp.signinbutton();
	
	}
	
	
	
}
