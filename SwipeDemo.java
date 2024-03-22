package uday_appium;

import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import junit.framework.Assert;


public class SwipeDemo extends BaseTest {

	
	@Test
	public void SwipeDemoTest()throws MalformedURLException,InterruptedException
	{
	
	
      driver.findElement(AppiumBy.accessibilityId("Views")).click();
      driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
      driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
      WebElement firstImage = driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]"));
      Assert.assertEquals( driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");  // boolen 
//     Swipe
     
//    Assert.assertEquals(driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
     
     
     ((JavascriptExecutor)driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
    		    "elementId" , ((RemoteWebElement)firstImage).getId(),
    		    "direction", "left",
    		    "percent", 0.75
    		));
     
     
     
     Assert.assertEquals(driver.findElement(AppiumBy.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false"); 
   
	}
	
	

}

                                 
