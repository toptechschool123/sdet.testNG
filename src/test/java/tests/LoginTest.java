package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import core.BaseClass;



public class LoginTest extends BaseClass {
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("it is before test");
			BaseClass.initializeDriver();
	}
	
	
	

	
	
	@AfterTest
	public void afterTest() {
		BaseClass.tearDown();
	}
	
	

}
