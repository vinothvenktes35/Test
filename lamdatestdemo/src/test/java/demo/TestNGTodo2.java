package demo;

import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNGTodo2 {
	WebDriver driver;

	@BeforeMethod
	public void setup(Method m, ITestContext ctx) throws MalformedURLException {
		WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=qxZdhiW4U40");
	}

	 @Test
	  public void testUntitledTestCase() throws Exception {
	   String URL= driver.getCurrentUrl();
	   System.out.println("URL");
		 
	      }


	@AfterMethod
	public void tearDown() {
		
		driver.quit();
	}
}
