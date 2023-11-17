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
	
	@Test(enabled=false)
	public static void test1() {
		System.out.println("it is test one");
	
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Ignore
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	
	
	@AfterTest
	public void afterTest() {
		BaseClass.tearDown();
	}
	
	

}
