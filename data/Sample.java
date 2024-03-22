package data;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sample {
	public static WebDriver driver;
    public static SoftAssert softassert =new SoftAssert();
	
	
	@Test
	public void ninjaLoginTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\UD\\chromedriver\\chromedriver.exe");
		ChromeOptions opt =new ChromeOptions();
		
		
		opt.addArguments("--remote-allow-origins=*");
		
		
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.get("http://tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpana@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
	}

}
