package tests;

import org.testng.annotations.Test;



public class TestNG_Grouping {

	

	

	@Test(groups={"group1"})
	public void test1() {
		System.out.println("it is test1");

	}

	@Test(groups = {"regression"})
	public void test2() {
		System.out.println("it is test2");

	}
   
	@Test(groups={"group1"})
	public void test3() {
		System.out.println("it is test3");

	}
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("it is test4");

	}
	
	@Test(groups = {"group1"})
	public void test5() {
		System.out.println("it is test5");

	}
}