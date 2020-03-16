package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage{
	
	
	public WebDriver driver;
	By username=By.xpath("//input[@id='user_email']");
	By password=By.xpath("//input[@name='user[password]']");
	By submit=By.xpath("//input[@name='commit']");
	
	
	public LoginPage(WebDriver driver)
	{
	this.driver=driver;
	}

	public WebElement getUserName()
	{
		return driver.findElement(username);
	}
	public WebElement getPassoword()
	{
		return driver.findElement(password);
	}
	public WebElement getSubmit()
	{
		return driver.findElement(submit);
	}
	
}
