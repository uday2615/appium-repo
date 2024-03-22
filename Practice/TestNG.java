package Practice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
	 @BeforeMethod
		public void GoogleTest() {
			
			System.out.println("uday");
		}
		
		 
		 @Test
		 public void test() {
			 System.out.println("sunil");
		 }
		 
		 @AfterMethod 
		 public void After() {
			 System.out.println("parit");
		 }
}
