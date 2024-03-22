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


public class AppAlert extends BaseTest {

	
	@Test
	public void AppAlertTest()throws MalformedURLException,InterruptedException
	{
	
	
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
//      driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
//      driver.findElement(By.id("android:id/button1")).click();
      
//      Thread.sleep(4000);
      
//      driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a long message")).click();
//      driver.findElement(By.id("android:id/button1")).click();
      
//      Thread.sleep(4000);
      
//     driver.findElement(AppiumBy.accessibilityId("Repeat alarm")).click();      //alarm
//     driver.findElement(By.xpath("//android.widget.CheckedTextView[1]")).click();
//     driver.findElement(By.id("android:id/button1")).click();
//
//      Thread.sleep(4000);
      
		driver.findElement(By.id("io.appium.android.apis:id/text_entry_button")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[1]")).sendKeys("hey Beb");
		driver.findElement(AppiumBy.xpath("//android.widget.EditText[2]")).sendKeys("123456789");
		driver.findElement(By.id("android:id/button1")).click(); 

  	
     
      
     
	}
	
	
	
}

                                 

