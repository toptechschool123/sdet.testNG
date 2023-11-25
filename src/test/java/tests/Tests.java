package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Tests {

	// difference between BeforeTest and BeforeMethod
	// @BeforeTest
	@BeforeTest
	public void beforeTest() {
		// driver.get(www.googl.come);
	}

	@Ignore
	@Test
	public void test1() {

		System.out.println("hi it is 1");
	}

	@Test(enabled = false)
	public void test2() {
		System.out.println("it is test 2");
	}

	@Test(priority = 1, groups= {"RegressionTest"})
	public void test3() {
		System.out.println("it is test 3");
	}

	@Test(priority = 2, groups= {"smokeTest"})
	public void test4() {
		System.out.println("it is test 4 ");
	}

	
	@Test(alwaysRun=true)
	public void test5() {
		System.out.println("it is test 5");
	}
	@Test(dependsOnMethods= {"test5"})
	public void test6() {
		System.out.println("it is test 6");
	}
	
	@Test(groups= {"smokeTest"})
	public void test7() {
		System.out.println("it is test 7");
	}
	
	@Test(groups= {"RegressionTest"})
	public void test8() {
		System.out.println("it is test ");
	}

	@Test(dependsOnGroups= {"smokeTest"})
	public void test9() {
		System.out.println("it is test 9");
	}
	
	// thread.sleep();
	
	@Test(timeOut=3000)
	public void test10() {
		System.out.println("it is test 10");
	// @AfterTest
	}
	@AfterTest
	public void afterTest() {
		// driver.close/quit();
	}

}
