package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ForgotPasswordPage {
	
	WebDriver driver;
	By email = By.id("user_email");
	By send = By.cssSelector("input[class='btn btn-primary btn-md login-button']");
	
	public ForgotPasswordPage(WebDriver driver) 
	{
		this.driver = driver;
	}
	
	
	public WebElement email()
	{
		return driver.findElement(email);
		 
	}
	
	public WebElement send()
	{
		return driver.findElement(send);
	}

}
