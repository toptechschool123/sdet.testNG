package tests;


import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider {
	
	
	@Test(dataProvider="testData")
	public void test1(String user1, String pass1) {
		
		System.out.println(user1);
	
		System.out.println(pass1);
	
		
	}
		
		
	
	
	
	
	// DataProvider
	
	
	@DataProvider(name="testData")
	public Object myData() {
		
	
		Object [][] data = {
				{"user1", "pass1"},
				{"user2", "pass2"}, 
				{ "user3", "pass3"} 
				};
		
		return data;
		}
		
		
	
		
	}


