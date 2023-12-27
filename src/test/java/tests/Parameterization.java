package tests;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization {
	
	@Parameters({"browser", "userName", "password"})
	@Test
	public void test(String browser, String username, String pass) {
		
		System.out.println("the parametes are as follows: " + browser + "  " + username + " " + pass);
	}
	

}
