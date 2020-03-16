package Academy;
import java.io.IOException;

//import org.apache.log4j.LogManager;
//import org.apache.log4j.Logger;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import pageObjects.LoginPage;
import Academy.Base;


public class HomePageTestCase extends Base {

	//public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void intialize() throws IOException
	{
		driver=intitalizeDriver();	
	}
	
	@Test(dataProvider="getData")
	public void basePageNavigation(String username,String password,String text) throws IOException
	{	
		driver.get("http://qaclickacademy.com/");
		LandingPage lp=new LandingPage(driver);
		lp.getLogin().click();
		LoginPage ln=new LoginPage(driver);
		ln.getUserName().sendKeys(username);
		ln.getPassoword().sendKeys(password);
		System.out.println("zxcvbv");
		System.out.println("asdfgf");
		System.out.println("qwertr");
		System.out.println("poiuyu");
	//	System.out.println(text);
	//	log.info(text);
		ln.getSubmit().click();
	}
	
	
	@DataProvider
	public  Object[][] getData()
	{
		Object[][] data=new Object[2][3];
		data[0][0]="gattu";
		data[0][1]="gattu";
		data[0][2]="restricteduser";
		
		data[1][0]="gattu2";
		data[1][1]="gattu2";
		data[1][2]="unrestricteduser";
		return data;
	}
	
	@AfterTest
	public void exit()
	{
		driver.close();
		driver=null;
	}
}
