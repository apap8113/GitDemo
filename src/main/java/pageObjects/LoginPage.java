package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	
	WebDriver driver;
	By email = By.id("user_email");
	By password = By.id("user_password");
	By signin = By.cssSelector("input[type='submit']");
	By forgot = By.cssSelector("a[href*='password']");
	
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public WebElement email()
	{
		return driver.findElement(email);
		 
	}
	
	public WebElement password()
	{
		return driver.findElement(password);
	}
	
	public WebElement signin()
	{
		return driver.findElement(signin);
	}
	
	public ForgotPasswordPage forgot()
	{
		driver.findElement(forgot).click();
		ForgotPasswordPage fp = new ForgotPasswordPage(driver);
		return fp;
	}
	
	

}
