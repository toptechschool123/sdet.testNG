package tests;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;

import core.BaseClass;

public class TestNG_Annotations extends BaseClass {

	

	@BeforeTest
	public void beforeTest() {

		System.out.println("it is before test");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("it is after test");
	}

	@BeforeSuite
	public void beforeSuite() {

		System.out.println("it is before suite");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("it is after suite");
	}

	@BeforeMethod
	public void beforeMethod() {

		System.out.println("it is before method");
	}

	@AfterMethod
	public void afterMethod() {

		System.out.println("it is after method");
	}
	@BeforeGroups
	public void beforeGroups() {

		System.out.println("it is before groups");
	}
	
	@AfterGroups
	public void afterGroups() {

		System.out.println("it is after groups");
	}
	@Test
	public void test1() {
		System.out.println("it is test");

	}
	@Test
	public void test2() {
		System.out.println("it is test");

	}
	
	
}