package tests;



import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Annotations {
	
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("it is before test");
			
	
	
	}
	
	// before hooks	in jUnit----	@Before
	// and after hooks in Junit---- @After 
	@Test
	public static void test1() {
		System.out.println("it is test one");
	
	}
	@Test
	public void test2() {
		System.out.println("test2");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	
	
	
	@AfterTest
	public void afterTest() {
		System.out.println("it is after test");
		// testing evn website
	}
	
	

}
