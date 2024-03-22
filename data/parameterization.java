package data;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class parameterization {
	
	public static WebDriver driver;
	
	
	@Test
	public void Rediff() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\UD\\chromedriver\\chromedriver.exe");
		ChromeOptions opt =new ChromeOptions();
		
		
		opt.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("https://rediff.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.findElement(By.className("Sign in")).click();
		driver.findElement(By.name("login")).sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.name("passwd")).sendKeys("Selenium@123");
		driver.findElement(By.className("signinbtn")).click();
	

}
}