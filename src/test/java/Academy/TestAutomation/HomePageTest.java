package Academy.TestAutomation;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LangingPage;
import pageObjects.LoginPage;
import resources.Base;

public class HomePageTest extends Base{
	
	public WebDriver driver;
	
	@Test(dataProvider = "dataProvider")
	public void navigation(String email , String password) throws IOException
	{
		driver = invokeDriver();	
		driver.get(prop.getProperty("url"));
		LangingPage l = new LangingPage(driver);
		
		Assert.assertEquals(l.titile().getText(),"FEATURED COURSES");
		
		LoginPage login = l.login();
		
		System.out.println("login page");

		login.email().sendKeys(email);
		login.password().sendKeys(password);
		login.signin().click();
		
		System.out.print("Login done");
	}
	
	@DataProvider
	public Object[][] dataProvider()
	{
		Object[][] obj = new Object[1][2];
		
		obj[0][0]="abc@def";
		obj[0][1]="12345";
		
		return obj;
	}

}
