package uday_appium;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_1 extends BaseTest{

	
	@Test
	public void FillForm() throws InterruptedException {
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("123456");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));")).click();
		 
		driver.findElement(AppiumBy.xpath("//android.widget.Button")).click();
		
		//String toastMessage = driver.findElement(AppiumBy.xpath("(//android.widget.Tost)[1]")).getAttribute(" name");     // to handle the toast messages
		//Assert.assertEquals(toastMessage, "Please enter your name");
		
		
		
		}
	

	
	
}
