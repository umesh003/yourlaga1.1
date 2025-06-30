package testBase;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class BaseClass {
	
	public WebDriver driver;
	public Logger logger;
	@Parameters({"browser"})
	@BeforeClass
	public void setup(String br) throws InterruptedException
	{
		logger=LogManager.getLogger(this.getClass());
		
		switch(br)
		{
		case "chrome": driver=new ChromeDriver();break;
		case "edge": driver=new EdgeDriver();break;
		case "firefox":driver=new FirefoxDriver();break;
		//case "opera": driver=new OperaDriver();break;
		default: System.out.println("Invalid browser name"); return;
		}
		
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("http://www.automationpractice.pl/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
	@AfterClass
	public void teardown()
	{
		driver.close();
	}
	//To generate random characters
		public String randomString()
		{
			String randstr=RandomStringUtils.randomAlphabetic(5);
			return randstr;
			
		}
		//to generate random numbers
		public String randomNumbers()
		{
			String numbers=RandomStringUtils.randomNumeric(10);
			return numbers;
		}
		//to generate random aphanumeric
			public String randoAlphaNumeric()
			{
				String randstr=RandomStringUtils.randomAlphabetic(3);
				String numbers=RandomStringUtils.randomNumeric(3);
				return (randstr+"@"+numbers);
			}

}
