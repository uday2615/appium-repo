package uday_appium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class massage extends BaseTest{
	
@Test
	public void Textmsg () throws InterruptedException {
		
	driver.findElement(By.className("android.widget.Button")).click();
	driver.findElement(By.id("com.google.android.apps.messaging:id/welcome_fragment_spam_next_button")).click();
	driver.findElement(AppiumBy.accessibilityId("Start chat")).click();
	driver.findElement(By.className("android.widget.EditText")).sendKeys("1234567890");
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup[4]/androidx.compose.ui.platform.ComposeView/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View")).click();
	driver.findElement(By.id("com.google.android.apps.messaging:id/compose_message_text")).sendKeys("hey good morning");
	driver.findElement(AppiumBy.accessibilityId("Send SMS")).click();
	
	
	Thread.sleep(8000);
	WebElement smsD =driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Now, SMS\"]"));
	
	if (smsD.isDisplayed() && smsD.getText().equals("Now, SMS ")) 
	{
        System.out.println("Message delivered successfully.");
    } else 
    {
        System.out.println("Message delivery failed.");
    }
}

}



//Now, SMS 