package uday_appium;

import java.time.Duration;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class eCommerce_4 extends BaseTest{

	
	@Test
	public void FillForm() throws InterruptedException {
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("123456");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));")).click();
		 
		driver.findElement(AppiumBy.xpath("//android.widget.Button")).click();
		
		//String toastMessage = driver.findElement(AppiumBy.xpath("(//android.widget.Tost)[1]")).getAttribute(" name");     // to handle the toast messages
		//Assert.assertEquals(toastMessage, "Please enter your name");
		   
		driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(0).click();   // 1st product 
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Converse All Star\"));"));
		driver.findElements(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(1).click();   // 2nd product
		
		
			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			Thread.sleep(2000);
			
			List <WebElement> productPrices = driver.findElements(By.id("com.androidsample.generalstore:id/productPrice"));
			int Count =productPrices.size();
			double totalSum = 0;
			for(int i=0; i<Count ; i++)
			{
				String amountString =productPrices.get(i).getText();
				
//				$160.5 when we want remove the first char , then use ......
//				decimal no. are here in prices thats why we are using Double format 
				Double price =Double.parseDouble(amountString.substring(1));     // also we write  getFormattedAmount(amountString);  based on baseTest
				totalSum = totalSum +price;
				}	
			
			
			String displaySum = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
			Double displayFormattedSum = getFormattedAmount(displaySum);   
//			Assert.assertEquals(totalSum, displayFormattedSum);   OR
			Assert.assertEquals(totalSum, 215.97);
			WebElement ele = driver.findElement(By.id("com.androidsample.generalstore:id/termsButton"));
			LongPressAction(ele);
			
			driver.findElement(By.id("android:id/button1")).click();
			
			
			
			driver.findElement(By.xpath("//android.widget.CheckBox")).click();
			driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
			Thread.sleep(6000);
//			  this app is hybrid app we want to also automation testing in WebPage .
			Set<String> contexts =driver.getContextHandles();
			for (String contextName : contexts)
			{                                                                              // java insHance loop 
				System.out.println(contextName);
			}
			
			driver.context("WEBVIEW_com.androidsample.generalstore");      // Chrome driver
			

			driver.findElement(By.name("q")).sendKeys("Uday shetty memes");
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);  // enter on Search key
			driver.pressKey(new KeyEvent(AndroidKey.BACK));           // back on script
	
		}	
	
	

	

}
