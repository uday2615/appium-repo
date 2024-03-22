package uday_appium;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import junit.framework.Assert;

public class ScrollDemo extends BaseTest {

	
	@Test
	public void ScrollDemoTest()throws MalformedURLException,InterruptedException
	{
		
	
      driver.findElement(AppiumBy.accessibilityId("Views")).click();
      DeviceRotation LandScape = new DeviceRotation(0,0,90);
		driver.rotate(LandScape);
      driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView3\"));"));
      Thread.sleep(3000);
   
	}
	
	

}

                                 
