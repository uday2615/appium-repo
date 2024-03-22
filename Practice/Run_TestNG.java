package Practice;

import org.testng.annotations.Test;

public class Run_TestNG {
	@Test(priority=1)
	public void begin() {
		System.out.println("begin");
		
	}
	
	@Test(priority=2,dependsOnMethods="begin")
	public void ready() {
		
		System.out.println("ready");
	}
	
	@Test(priority=3,dependsOnMethods={"begin","ready"})
	public void steady() {
		System.out.println("steady");
	}
	
	
	@Test(priority=4 ,dependsOnMethods={"begin","ready" ,"steady"})
	public void go() {
		System.out.println("go");
	
}
}