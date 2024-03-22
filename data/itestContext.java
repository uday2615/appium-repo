package data;

import org.testng.ITestContext;
import org.testng.annotations.Test;

public class itestContext {
	
	@Test(priority =1)
	public void setUp(ITestContext context) {
		System.out.println("the setup of laptop");
		context.setAttribute("Windows10", "ASUS");
	}

	@Test(priority =2,dependsOnMethods="setUp")
	public void logIn(ITestContext context) {
		System.out.println("login in facbook account");
		String OperatingSystem =(String)context.getAttribute("Windows10");
		System.out.println("the set up of the operating system :" + OperatingSystem);
		context.setAttribute("Complex ","Agile + DevOps");
		
	}
	
	@Test(priority =3,dependsOnMethods ={"setUp","logIn"})
	public void Exit(ITestContext context) {
		System.out.println("exit in next door ");
	String OperatingSystem	=(String)context.getAttribute("Windows10");
	System.out.println("the set up of the operating system : " + OperatingSystem);
	
	
	String LogicComplxity =(String)context.getAttribute("Complex");
	
	System.out.println("the complex of the two methods :" + LogicComplxity);
		
	}
}
