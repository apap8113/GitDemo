package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LangingPage {
	
	WebDriver driver;
	By login = By.cssSelector("a[href*='sign_in']");
	By title = By.cssSelector("div[class='text-center'] h2");
	
	public LangingPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public LoginPage login()
	{
		driver.findElement(login).click();
		LoginPage lg = new LoginPage(driver);
		return lg;
		 
	}
	
	public WebElement titile()
	{
		return driver.findElement(title);
	}

}
