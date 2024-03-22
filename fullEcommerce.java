package uday_appium;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class fullEcommerce extends BaseTest {
	
	@Test
	public void fullForm () throws InterruptedException{
		
		driver.findElement(By.className("android.widget.Spinner")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Aruba\"));")).click();
		 
		 driver.findElement(By.className("android.widget.EditText")).sendKeys("123");
		 driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
		 driver.findElement(By.className("android.widget.Button")).click();
		 
		 driver.findElements(By.id("com.androidsample.generalstore:id/productAddCart")).get(1).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Jordan 6 Rings\"));")).click();
		 driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(1).click();
		 driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"PG 3\"));")).click();
		 driver.findElements(AppiumBy.xpath("//android.widget.TextView[@text='ADD TO CART']")).get(1).click();
		 
		 driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
		 
		 Thread.sleep(4000);

	}

}


