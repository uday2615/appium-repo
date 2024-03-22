package uday_appium;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import junit.framework.Assert;

public class ExtendBase extends BaseTest {

	@Test
	public void WifiWork1() throws MalformedURLException, InterruptedException {

		// tagName[@attributes='value'] - XPath
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();

		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();

		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();

		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(alertTitle, "WiFi settings");

		driver.findElement(By.id("android:id/edit")).sendKeys("Uday WIFI");

		driver.findElement(By.id("android:id/button1")).click();

	}

}

//	Assert.assertEquals(alertTitle,"WiFi settings");