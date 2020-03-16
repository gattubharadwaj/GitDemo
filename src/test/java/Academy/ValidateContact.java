package Academy;
import java.io.IOException;

import org.testng.Assert;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import Academy.Base;

public class ValidateContact extends Base {
//	public static Logger log=LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void intialize() throws IOException
	{
		driver=intitalizeDriver();
		driver.get("http://qaclickacademy.com/");
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=intitalizeDriver();
		driver.get(props.getProperty("url"));
		LandingPage lp=new LandingPage(driver);
		Assert.assertTrue(lp.getContact().isDisplayed());		
	//	log.info("Navigation bar is displayed");
	}
	
	@AfterTest
	public void exit()
	{
		driver.close();
		driver=null;
	}
}
