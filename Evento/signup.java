package Evento;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class signup {
WebDriver driver;
String enteredValue2;
WebElement name;
WebElement name1;
WebElement name2;
WebElement name3;
WebElement name4;
WebElement element;
@BeforeMethod
public void Setup(){
	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Desktop\\UD\\chromedriver\\chromedriver-win64\\chromedriver.exe");
	
	this. driver = new ChromeDriver();	
	this.driver.get("http://localhost:5173/");
	this. driver.manage().window().maximize();
	 
}
@Test(priority = 1)
public void run() {
	WebElement name1 =driver.findElement(By.id("field1"));
	name1.sendKeys("udayparit@gmail.com");
	
	String enteredValue1 = name1.getAttribute("value");
	
	   String pattern = "(^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$)";
	   boolean matches1 = enteredValue1.matches(pattern);
	    
	   
	  	if(matches1 ) {
	  		 System.out.println("pass1");
	  	}
	  	else {
	  		System.out.println("fail1");
	  	}
	  	
	  	
}
@Test(priority = 2)
public void signup() {
	driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/button[1]")).click();
}
@Test(priority = 3)
	public void email() {
	driver.get("http://localhost:5173/account");
	WebElement element =driver.findElement(By.id("field1"));
	
	String CurrentPage = element.getText();

	String previousPage ="udayparit@gmail.com";

	if(CurrentPage.equals(previousPage) ) {
		System.out.println("pass2");
	}
	else {
		System.out.println("fail2");
	}
}
@Test(priority = 4)
public void fullname() {
	driver.get("http://localhost:5173/account");
//  	WebElement A1=driver.findElement(By.id("firstName"));
//  	A1.sendKeys("uday");
//  	WebElement A2=driver.findElement(By.id("lastName"));
//  	A2.sendKeys("Parit");
  	WebElement name=driver.findElement(By.id("field2"));
  	name.sendKeys("uday parit");
//  	String enteredValue = A1.getAttribute("value");
//  	 String enteredValue9 =A2.getAttribute("Value");
  	String pattern1="^[a-zA-Z '-]+$";
  	String enteredValue=name.getAttribute("value");
  	 boolean matches = (enteredValue).matches(pattern1);
//	
//	
	if(matches ) {
		 System.out.println("pass3");
	}
	else {
		System.out.println("fail3");
	}
}
@Test(priority = 5)
public void password() {
	driver.get("http://localhost:5173/account");
	WebElement name2=driver.findElement(By.id("field3"));
	name2.sendKeys("Uday@342");
	String pattern2="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%*?&])[A-Za-z\\d@#$!%*?&]{8}$";
	String enteredValue2 =name2.getAttribute("value");
	
	
	 boolean matches2 = enteredValue2.matches(pattern2);
	 if(matches2 ) {
		 System.out.println("pass4");
	}
	else {
		System.out.println("fail4");
	}
}
@Test(priority = 6)
public void confirmpass() {
	driver.get("http://localhost:5173/account");
	WebElement name2=driver.findElement(By.id("field3"));
	WebElement name3= driver.findElement(By.id("field4"));
	name2.sendKeys("Uday@342");
	name3.sendKeys("Uday@342");
	String pattern2="^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@#$!%*?&])[A-Za-z\\d@#$!%*?&]{8}$";
	String enteredValue2 =name2.getAttribute("value");
	String enteredValue3 =name3.getAttribute("value");
	
//	String password =name2.getText();
//	String confirm = name3.getText();
	
 
	
	boolean matches3 = enteredValue3.matches(enteredValue2);
	
	 if(matches3)  {
		 System.out.println("pass5");
	}
	else {
		System.out.println("fail5");
	}
	 
}
@Test(priority = 7)
public void phonenumber() {
	driver.get("http://localhost:5173/account");
	 WebElement name4=driver.findElement(By.id("field5"));
	 name4.sendKeys("1234567890");
	 String enteredValue4 =name4.getAttribute("value");
	 String pattren4="[0-9]{10}";
	 boolean matches4 =enteredValue4.matches(pattren4);
	 
	 if(matches4 ) {
		 System.out.println("pass6");
	}
	else {
		System.out.println("fail6");
	}
	 
	 driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/div/div[3]/div[6]/input")).click();
}

public void Empty() {
	 if(name1.getText().isEmpty()|| name2.getText().isEmpty() || name3.getText().isEmpty() || name4.getText().isEmpty()|| name.getText().isEmpty()|| element.getText().isEmpty() ){
			
		  System.out.println("Alert displayed");
	 } else {
           System.out.println(" successfully.");
       }
	 
	 
	 driver.findElement(By.id("root")).click();
}

@AfterMethod
	public void TearDown() {
	driver.quit();
	}
}
