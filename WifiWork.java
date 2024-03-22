package uday_appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class WifiWork {

	
    @Test
	public void WifiWork1() throws MalformedURLException, InterruptedException
	{
		
		AppiumDriverLocalService builder = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//HP//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))				
				.withIPAddress("127.0.0.1")
				.usingPort(4723)
				.build();
		builder .start();
		
		
		UiAutomator2Options Options =new UiAutomator2Options();
		Options.setDeviceName("Uday");
		Options.setApp("C://Users//HP//eclipse-workspace//udemy//src//test//java//App//ApiDemos-debug.apk");
		
		
		AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), Options);
		
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		Thread.sleep(3000);
	
		
		Thread.sleep(3000);
		
	driver.quit();
	builder .stop();
	}

}
