package Practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertion {

	
	@Test
	public void Critical() {
	String ExpectedOutPut="We are learnig english";
	String ActualOutPut="We are learning english and hindi";
	Assert.assertEquals(ActualOutPut, ExpectedOutPut);
	}
	
	
	@Test
	public void High() {
		boolean b1=1<2;
		boolean b2=2>5;
		Assert.assertTrue(b1!=b2, "2 can never be greter than 5");
		
	}
	
	@Test
	public void Medium() {
		
	}
	
	@Test
	public void Low() {
		
	}
	
}
