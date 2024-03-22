package Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Priorites {

	
	 @BeforeMethod
		public void Login() {
			
			System.out.println("1");
		}
		
		 
		 @Test
		 public void A1() {
			 System.out.println("2");
		 }
		 
		 @Test
		 public void A2() {
			 System.out.println("3");
		 }
		 
		 @Test
		 public void A3() {
			 System.out.println("4");
		 }
		 
		 @AfterMethod
		 public void LogOut() {
			 System.out.println("5");
		 }
}
