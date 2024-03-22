package Practice;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data {

	@Test(dataProvider="getData")
	public void DataMatrix(String username, String password,int mobile, String Browser) {
		
	}
	
	
	@DataProvider
	
	public Object[][]getData() {
		
	Object[][] data = new Object[3][4];
	data[0][0]="username";
	data[0][1]="password";
	data[0][2]=90494349;
	data[0][3]="mozilla";
	
	
	
	data[1][0]="username1";
	data[1][1]="password1";
	data[1][2]=90494348;
	data[1][3]="chorme";
	
	
	
	data[2][0]="username2";
	data[2][1]="password2";
	data[2][2]=91424849;
	data[2][3]="safari";
	return data;
	
	
}
}