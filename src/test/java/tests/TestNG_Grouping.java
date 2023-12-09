package tests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import core.BaseClass;

public class TestNG_Grouping extends BaseClass {

	

	

	@Test(groups={"smoke"})
	public void test1() {
		System.out.println("it is test1");

	}

	@Test(groups = {"regression"})
	public void test2() {
		System.out.println("it is test2");

	}

	@Test(groups={"smoke"})
	public void test3() {
		System.out.println("it is test3");

	}
	@Test(groups = {"regression"})
	public void test4() {
		System.out.println("it is test4");

	}
	
	@Test(groups = {"smoke"})
	public void test5() {
		System.out.println("it is test5");

	}
}