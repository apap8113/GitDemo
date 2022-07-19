package stepDefinations;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LangingPage;
import pageObjects.LoginPage;
import pageObjects.PortalHomePage;
import resources.Base;


public class StepDefination extends Base{

	WebDriver driver;
	
    @Given("^Initiate the browser with chrome$")
    public void initiate_the_browser_with_chrome() throws Throwable {
    	
    	driver = invokeDriver();
    	System.out.println("1");
    }

    @When("^User enters (.+) and (.+) and logs in$")
    public void user_enters_something_and_something_and_logs_in(String strArg1, String strArg2) throws Throwable {
    	System.out.println("4");
    	LangingPage l = new LangingPage(driver);
		Assert.assertEquals(l.titile().getText(),"FEATURED COURSES");
    	LoginPage login = l.login();
		System.out.println("login page");
		System.out.println(strArg1);
		System.out.println(strArg2);
		login.email().sendKeys(strArg1);
		login.password().sendKeys(strArg2);
		login.signin().click();
		System.out.print("Login done");
	
    }

    @Then("^verify that user is successfully logged in$")
    public void verify_that_user_is_successfully_logged_in() throws Throwable {
    	System.out.println("5");
    	//PortalHomePage p = new PortalHomePage(driver);	
    	//Assert.assertTrue(p.getSearchBox().isDisplayed());
    }

    @And("^Navigate to \"([^\"]*)\" site$")
    public void navigate_to_something_site(String strArg1) throws Throwable {
    	System.out.println("2");
    	driver.get(strArg1);
    }

    @And("^Click on login link in home page to land on secure sign in page$")
    public void click_on_login_link_in_home_page_to_land_on_secure_sign_in_page() throws Throwable {

    	System.out.println("3");
    	//LangingPage l = new LangingPage(driver);
		//Assert.assertEquals(l.titile().getText(),"FEATURED COURSES");
		    }

}