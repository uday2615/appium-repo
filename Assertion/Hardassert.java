package Assertion;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Hardassert {
	
	
	@Test
	public void hard() {
		
	System.out.println("First hard assert");
	Assert.assertTrue(true);
	
	System.out.println("2nd hard assert");
	Assert.assertTrue(false);
	
	System.out.println("#rd hard assert");
	Assert.assertTrue(true);
	
	}

	
	@Test
	public void Soft() {
		SoftAssert softassert =new SoftAssert();
		
		System.out.println("1ST ONE SOFTASSERT");
		softassert.assertTrue(true);
		
		System.out.println("2nd softassert");
	    softassert.assertTrue(false);
	
		System.out.println("3rd softassert");
	softassert.assertTrue(true);
		
	softassert.assertAll();
		
	}
}
