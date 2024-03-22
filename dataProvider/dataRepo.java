package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class dataRepo {

	
	@DataProvider 
	
	public static Object[][]getData(Method name){
		System.out.println("test cases " +name.getName());
		Object[][] data =new Object[3][4];
		
		
		data[0][0]="username1";
		data[0][1]=101; 
		data[0][2]="uparit1@qualtech.biz";
		data[0][3]=98982115;
		
		data[1][0]="username2";
		data[1][1]=102;
		data[1][2]="uparit2@qualtech.biz";
		data[1][3]=98982116;
		
		data[2][0]="username3";
		data[2][1]=103;
		data[2][2]="uparit3@qualtech.biz";
		data[2][3]=98982117;
		return data;
	}
	
}
