package uday_appium;

import java.io.File;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;
import junit.framework.Assert;

public class BaseTest {
//	main class
	public AndroidDriver driver;
	public AppiumDriverLocalService builder;

	@BeforeClass // run the method before child class
	public void ConfigureAppium() throws MalformedURLException {
		builder = new AppiumServiceBuilder()
				.withAppiumJS(
						new File("C://Users//HP//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
				.withIPAddress("127.0.0.1").usingPort(4723).build();
		builder.start();

		UiAutomator2Options Options = new UiAutomator2Options();
		Options.setDeviceName("Uday"); // emulator name
		// Options.setApp("C://Users//HP//eclipse-workspace//udemy//src//test//java//App//ApiDemos-debug.apk");
		Options.setChromedriverExecutable(
				"C://Users//HP//eclipse-workspace//udemy//src//test//java//App//chromedriver.exe");
		Options.setApp("C://Users//HP//eclipse-workspace//udemy//src//test//java//App//com.google.android.apps.messaging-messages.android_20240123_01_RC04.phone_dynamic-APK4Fun.com.apk");  // app change link change 
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), Options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}

	public void LongPressAction(WebElement ele) {

		((JavascriptExecutor) driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId", ((RemoteWebElement) ele).getId(), "duration", 2000));
	}

	public Double getFormattedAmount(String amount) {
		Double price = Double.parseDouble(amount.substring(1));
		return price;
	}

	@AfterClass // run the method after child class
	public void tearDown() {
		driver.quit();
		builder.stop();
	}
}
