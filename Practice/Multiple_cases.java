package Practice;

import org.testng.annotations.Test;

import dataProvider.dataRepo;

public class Multiple_cases {

	@Test(dataProviderClass=dataRepo.class ,dataProvider="getData")
	public void LunchUrl(String username , int emp_id , String email_id , int mobile_no) {
		
	}
	
	@Test(dataProviderClass=dataRepo.class ,dataProvider="getData")
	public void lunch1(String username , int emp_id , String email_id , int mobile_no) {
		
	}
	@Test(dataProviderClass=dataRepo.class ,dataProvider="getData")
	public void Lunch2(String username , int emp_id , String email_id , int mobile_no) {
		
	}
	@Test(dataProviderClass=dataRepo.class ,dataProvider="getData")
	public void LogOut(String username , int emp_id , String email_id , int mobile_no) {
		
	}
}
