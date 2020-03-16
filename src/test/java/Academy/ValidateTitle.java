package Academy;
import java.io.IOException;
//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import junit.framework.Assert;
import pageObjects.LandingPage;
import Academy.Base;

public class ValidateTitle extends Base {
	
	//public static Logger log=LogManager.getLogger(Base.class.getName());

	@BeforeTest
	public void intialize() throws IOException
	{
		driver=intitalizeDriver();
		//log.info("Driver is initialized");
		
		driver.get("http://qaclickacademy.com/");
		//log.info("Navigated to home page");

		
	}
	
	@Test
	public void basePageNavigation() throws IOException
	{
		driver=intitalizeDriver();
		driver.get("http://qaclickacademy.com/");
		
		LandingPage lp=new LandingPage(driver);
		Assert.assertEquals(lp.getTitle().getText(),"AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
	//    log.info("successfully validated text message");

		driver.close();
	}
	
	@AfterTest
	public void exit()
	{
		driver.close();
		driver=null;
	}
}
