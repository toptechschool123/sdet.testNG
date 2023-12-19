package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import core.BaseClass;
import pageObjects.LoginPageObjects;

public class LoginTest extends BaseClass{

	LoginPageObjects object = new LoginPageObjects();
	
	
	@BeforeMethod
	public void beforeMethod() {
		BaseClass.initializeDriver();
	}
	
	@Test
	public void login() {
		object.clickMyAccount();
		object.clickLogin();
		object.enterEmail(getUserName());
		object.enterPassword(getPassword());
		object.clickLoginBttn();
		object.clickLogoutBttn();
		
	}
}
