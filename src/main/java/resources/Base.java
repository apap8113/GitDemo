package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Base {
	
	
	public WebDriver driver;
	public Properties prop;
	
	public WebDriver invokeDriver() throws IOException 
	{
		String path = System.getProperty("user.dir")+"\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(path);
		prop = new Properties();
		prop.load(fis);
		
		String browser=prop.getProperty("browser"); // for data.properties file
		//String browser = System.getProperty("browser"); // for taking data from maven
		
		if(browser.equals("chrome"))
		{
			//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Ankit\\Downloads\\chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("headless");	
			//driver = new ChromeDriver(options);
			driver = new ChromeDriver();
		}
		
		if(browser.equals("browser"))
		{
			System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\src\\main\\java\\resources\\chromedriver.exe");
			driver = new ChromeDriver();
		}
				
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));		
		return driver;
	}
	
	public String screenshot(String testCaseName , WebDriver driver) throws IOException
	{
		TakesScreenshot ts =(TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		String dest = System.getProperty("user.dir")+"\\reports\\" + testCaseName + ".png";
		
		FileUtils.copyFile(source,new File(dest));
		
		return dest;
		
	}

}
