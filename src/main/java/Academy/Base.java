package Academy;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	
	public WebDriver driver;
	public Properties props;
	
	public WebDriver intitalizeDriver() throws IOException
	{
		props=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\Bharadwaj Gattu\\E2EProject\\src\\test\\java\\resources\\AutomationPluginProperties.properties");
		props.load(fis);
		if(props.getProperty("browser").equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
			driver=new ChromeDriver();
		}
		else if(props.getProperty("browser").equals("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if(props.getProperty("browser").equals("IE"))
		{
			driver=new InternetExplorerDriver();
		}
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		return driver;
					
	}
}





