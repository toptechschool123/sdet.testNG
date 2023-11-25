package tests;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import core.BaseClass;



public class TestNG_Annotations extends BaseClass {
	
	
	
	
	/*
	 * TestNG annotation
	 * @BeforeTest
	 * @Test
	 * @AfterTest
	 * 
	 * @BeforeMethod
	 * @AfterMethod
	 * 
	 * 
	 * @BeforeClass
	 * @AfterClass
	 * 
	 * @BeforeSuite
	 * @AfterSuite


	1: website
	2:  test
	3:  close test
	 */
	
	
	
	@BeforeTest
	public void beforeTest() {
		
		System.out.println("it is before test");
	}

	@Test(enabled=false)
	public void test1() {
		System.out.println("it is test1");
		System.out.println("it is test1");
		System.out.println("it is test1");
		
	}
	
	@Ignore
	@Test
	public void test2() {
		System.out.println("it is test 2");
	}
	
	@Test(invocationCount=2)
	public void test3() {
		System.out.println("it is test 3");	
	}	
	
	@Test(description="it is not complete")	
	public void test4() {
		System.out.println("it is test 4");
	}
	
	public void test5() {
		System.out.println("it is test 5");
	}
	@AfterTest
	public void afterTest() {
		
		System.out.println("it is after test");
}
}