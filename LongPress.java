package uday_appium;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import junit.framework.Assert;

public class LongPress extends BaseTest {

	
	@Test
	public void LongPress()throws MalformedURLException,InterruptedException
	{
		
	
      driver.findElement(AppiumBy.accessibilityId("Views")).click();
      driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
      driver.findElement(AppiumBy.accessibilityId("1. Custom Adapter")).click();
	  WebElement ele=driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
	  LongPressAction(ele);
//	  ((JavascriptExecutor) driver).executeScript("mobile: longClickGesture" ,
//			  ImmutableMap.of("elementId" ,((RemoteWebElement) ele).getId(),
//			  "duration", 2000 ))    ;                                               
	  // element ID = its mean where we want long press    ele = is a varibale stored in xpath of element id (people Name )    
	  
	 String menuText = driver.findElement(By.id("android:id/title")).getText()	;
	 Assert.assertEquals(menuText, "Sample menu");
	 Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
	}
	
	

}

                                 
