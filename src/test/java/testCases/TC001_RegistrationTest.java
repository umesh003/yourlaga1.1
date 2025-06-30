package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegistrationPage;
import testBase.BaseClass;

public class TC001_RegistrationTest extends BaseClass{
	
	@Test
	public void registrationTest() throws InterruptedException
	{
		
		try
		{
		logger.info("******* Started logs **********");
		HomePage hp=new HomePage(driver);
		hp.signinbtn();
		logger.info("Clicked on signin button");
		
		hp.emailfield(randomString()+"@gmail.com");
		hp.createbtn();
		logger.info("added email");
		Thread.sleep(3000);
	
		RegistrationPage rp= new RegistrationPage(driver);
		rp.title();
		rp.firstName(randomString());
		rp.lastName(randomString());
		rp.setPassword("Test@1234");
		rp.selectDate();
		rp.selectMonth();
		rp.selectYear();
		rp.registerbtn();
		Thread.sleep(5000);
		}
		catch(Exception e)
		{
			logger.error("Test failed");
			logger.debug("Debug logs");
		}
		logger.info("Test finished");
	}
	

}
