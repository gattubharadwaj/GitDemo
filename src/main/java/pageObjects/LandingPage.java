package pageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By signin=By.cssSelector("a[href*='http://qaclickacademy.usefedora.com/sign_in']");
	By title=By.xpath("//*[@id='myCarousel']/div/div/div/div/div[1]/h3");
	By contact=By.xpath("//a[@href='https://www.rahulshettyacademy.com']");
	
	
	public LandingPage(WebDriver driver)
	{
	this.driver=driver;
	}
	
	public WebElement getLogin()
	{
		return driver.findElement(signin);
	}
	
	public WebElement getTitle()
	{
		return driver.findElement(title);
	}
	
	public WebElement getContact()
	{
		return driver.findElement(contact);
	}
}
