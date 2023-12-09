package tests;


import org.testng.annotations.Test;

public class TestNG_Features {

	@Test
	public void test() {
		System.out.println("it is test method");

	}

	@Test(invocationCount = 3)
	public void runTestMultipleTimes() {
		System.out.println("it is invocation count");
	}

	@Test(description = "it is not ready yet")
	public void description() {
		System.out.println("it is description feature");
	}

	@Test(priority = 1)
	public void priority() {
		System.out.println("it is priority feature");
	}

	@Test(enabled = false)
	public void ignoreTest() {
		System.out.println("it is ignore Test");
	}

	@Test(priority =2)
	public void integration() {
		System.out.println("it is integration");
	}

	@Test(expectedExceptions = ArithmeticException.class)
	public void dividedByZeroExample1() {
		int e = 1 / 0;
		System.out.println(e);

	}

	
	@Test(timeOut = 1000) // specify time in milliseconds
	public void executetimeOut() {
		System.out.println("the time out is for 1000 milliseconds");
	}

	
}