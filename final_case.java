package paypal.QA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class final_case {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\Uday\\Desktop\\Chrome\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
	     
	   
	     driver.get("http://18.207.177.222/");
	     
	     // FirstName 
	     
	     WebElement A1=driver.findElement(By.xpath("/html/body/form/input[1]"));
		 A1.sendKeys("Uday");
		 String value1 =A1.getAttribute("value");
		 String pattern ="^[a-zA-Z '-]+$";
		 
		 boolean matches1=value1.matches(pattern);
		 if(matches1) {
			 System.out.println("pass1");
		 }
		 else {
			 System.out.println("fail1");
		 }
		 
		 
		 // LastName 
		 
		 WebElement A2=driver.findElement(By.xpath("/html/body/form/input[2]"));
		 A2.sendKeys("Uday");
		 String value2 =A2.getAttribute("value");
		 String pattern2="^[a-zA-Z '-]+$";
		 
		 boolean matches2=value2.matches(pattern2);
		 if(matches2) {
			 System.out.println("pass2");
		 }
		 else {
			 System.out.println("fail2");
		 }
		 
		 
		 
		 //CardholderName 
		 
		 WebElement A3=driver.findElement(By.xpath("/html/body/form/input[3]"));
		 A3.sendKeys("udayparit");
		 String value3=A3.getAttribute("value");
		 String pattern3="^[A-Za-z]+([ '-][A-Za-z]+)*$";
		 
		 boolean matches3=value3.matches(pattern3);
		 if(matches3) {
			 System.out.println("pass3");
		 }
		 else {
			 System.out.println("fail3");
		 }
		 
		 
		 // Amount
		 
			WebElement A4=driver.findElement(By.cssSelector("body > form > input[type=number]:nth-child(18)"));
			 A4.sendKeys("122");
			 String value4=A4.getAttribute("value");
			 String pattern4 = "^\\d{1,3}(,\\d{3})*(\\.\\d{1,2})?$";
			 
			 boolean matches4=value4.matches(pattern4);
			 if(matches4) {
				 System.out.println("pass4");
			 }
			 else {
				 System.out.println("fail4");
			 }
			 
		 //Card Number 	 
			 driver.switchTo().frame("braintree-dropin-frame");
			 
			
				WebElement A5=driver.findElement(By.name("credit-card-number"));
				 A5.sendKeys(" 4111 1111 1111 1111  ");
				 String value5=A5.getAttribute("value");
				 String pattern5=" ^(\\d{4}\\s){3}\\d{4}$  ";
				 
				 boolean matches5=value5.matches(pattern5);
				 if(matches5) {
					 System.out.println("pass5");
				 }
				 else {
					 System.out.println("fail5");
				 }
				 
				 
			//Expiration Date 
				 
				 
					WebElement A6=driver.findElement(By.cssSelector("#expiration"));
					 A6.sendKeys("12/25");
					 String value6=A6.getAttribute("value");
					 String pattern6="  ^(0[1-9]|1[0-2])\\/\\d{2}$ ";
					 

					 boolean matches6=value6.matches(pattern6);
					 if(matches6) {
						 System.out.println("pass6");
					 }
					 else {
						 System.out.println("fail6");
					 }
					 
					 
					 driver.findElement(By.xpath("/html/body/form/button")).click();
	}
	
	 
	}
