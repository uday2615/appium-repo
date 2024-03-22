package uday_appium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class MobileBrowser extends BrowserBaseTest{
	
	
	@Test
	public void browserTest() throws InterruptedException
	{
		
		    
	        driver.get("http://google.com");  // Fix the URL
	        Thread.sleep(4000);
	        
	        
	}

}
