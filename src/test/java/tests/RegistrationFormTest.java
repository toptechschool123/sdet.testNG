package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import core.BaseClass;
import pageObjects.RegistrationFormPageObjects;
import utils.ExcelUtility;

public class RegistrationFormTest extends BaseClass {
	
	RegistrationFormPageObjects object ;
	
	
	@BeforeTest
	public void beforeTest() {
		
		BaseClass.initializeDriver();
	}
	
	//String fName, String lName, String phone, String email, String pass, String confpass
	
	@Test(dataProvider = "testData")
	public void test(String fName, String lName, String phone, String email, String pass, String confpass) throws InterruptedException {
		object = new RegistrationFormPageObjects();
		
		
		object.clickOnMyAccount();
		object.clickRegister();
		object.enterFirstName(fName);
		object.enterLastName(lName);
		object.enterEmail(email);
		object.enterTelephone(phone);
		object.selectCountry();
		object.enterPassword(pass);
		object.enterPassword(confpass);
		object.clickSubscribe();
		object.clickPrivacyPolicy();
		
	}
	
	
	@DataProvider()
	public Object testData() {
		
		Object [][] data = ExcelUtility.getExcelData("info");
		
		return data;
		
	}
	
	@AfterTest
	public void afterTest() {
		BaseClass.tearDown();
	}

}
