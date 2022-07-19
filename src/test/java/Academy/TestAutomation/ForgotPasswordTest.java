package Academy.TestAutomation;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.ForgotPasswordPage;
import pageObjects.LangingPage;
import pageObjects.LoginPage;
import resources.Base;

public class ForgotPasswordTest extends Base{
	
	public WebDriver driver;
	
	@Test
	public void navigation() throws IOException
	{
		
		Logger logger = LogManager.getLogger(Base.class.getName());
		
		driver = invokeDriver();	
		driver.get(prop.getProperty("url"));
		LangingPage l = new LangingPage(driver);
		
		LoginPage login = l.login();
		
		logger.info("Login page");

		ForgotPasswordPage fp=login.forgot();
		fp.send().sendKeys("sd@gmail.com");
		
		logger.info("password sent on mail");
	}

}
