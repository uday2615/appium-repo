package uday_appium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class eCommerce_2 extends BaseTest{

	
	@Test
	public void FillForm() throws InterruptedException {
		
		
		driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("123456");
		driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		
		driver.findElement(By.id("android:id/text1")).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));")).click();
		 
		driver.findElement(AppiumBy.xpath("//android.widget.Button")).click();
		
		//String toastMessage = driver.findElement(AppiumBy.xpath("(//android.widget.Tost)[1]")).getAttribute(" name");     // to handle the toast messages
		//Assert.assertEquals(toastMessage, "Please enter your name");
		
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan Lift Off\"));")).click();
		 
		 int productCount =driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName")).size();
		 
		 for(int i=0;i<productCount;i++)
			{
				String productName=driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productName")).get(i).getText();
				
				if(productName.equalsIgnoreCase("Jordan Lift Off")) 
				{
					
				driver.findElements(AppiumBy.id("com.androidsample.generalstore:id/productAddCart")).get(i).click();
				
					}
			}
			driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
			Thread.sleep(4000);
			
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//			wait.until(ExpectedConditions.attributeContains(driver.findElement(By.id("com.androidsample.generalstore:id/toolbar_title")), "text", "Cart"));
			
		//	String lastProduct=driver.findElement(AppiumBy.id("com.androidsample.generalstore:id/productImage")).getText();
//			Assert.assertEquals(lastProduct, "Jordan Lift Off");
		}
	
	

}
