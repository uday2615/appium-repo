package uday_appium;

import java.net.MalformedURLException;
import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.Activity;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import junit.framework.Assert;

public class miscellaneousAction extends BaseTest {

	@Test
	public void miscellaneous() throws MalformedURLException, InterruptedException {

//	adb shell dumpsys window | find "mCurrentFocus"    for app activity and app package 
		// tagName[@attributes='value'] - XPath

		Activity activity = new Activity("io.appium.android.apis",
				"io.appium.android.apis.preference.PreferenceDependencies"); // directly jump to 3rd page
		driver.startActivity(activity);

//		driver.findElement(AppiumBy.accessibilityId("Preference")).click();                           we are using shortcut to jumb 3rd page 
//		driver.findElement(AppiumBy.accessibilityId("3. Preference dependencies")).click();

		driver.findElement(AppiumBy.id("android:id/checkbox")).click();
		DeviceRotation LandScape = new DeviceRotation(0, 0, 90); // DeviceRotation landscape
		driver.rotate(LandScape);
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String alertTitle = driver.findElement(By.id("android:id/alertTitle")).getText();

		Assert.assertEquals(alertTitle, "WiFi settings");
		driver.setClipboardText("Uday WIFI");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElement(By.id("android:id/button1")).click();
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME)); // to press button

	}

}

//	Assert.assertEquals(alertTitle,"WiFi settings");