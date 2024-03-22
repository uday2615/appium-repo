package uday_appium;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import io.appium.java_client.android.options.UiAutomator2Options;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class BrowserStack {

	public static void main(String[] args) throws MalformedURLException {
		 final String userName = "udayparit_iGZtfB";
		
		 final String Automatekey = "yRves8Ggo1vBWBjFvcDp";
		
		final String URL = "https://"+userName+":"+Automatekey+"@hub-cloud.BrowserStack.com/wd/hub";
		UiAutomator2Options Options = new UiAutomator2Options();		
		Options.setCapability("os", "Windows");
		
		Options.setCapability("os_version", "11");
		
		Options.setCapability("browser", "chrome");
		Options.setCapability("name", "uday");
		Options.setCapability("browser_version", "80");
		
		
		
		WebDriver driver =new RemoteWebDriver(new URL(URL),Options);
		driver.get("google.com");
		driver.manage().window().maximize();
		WebElement Search = driver.findElement(By.name("q"));
		Search.sendKeys("uday");
		Search.submit();
		System.out.println(driver.getTitle());
		
	}

}
