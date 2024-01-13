package tests;

import org.junit.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import core.BaseClass;
import pageObjects.RegistrationFormPageObjects;
import utils.ExcelUtility;

@Listeners(utils.Listeners.class)
public class RegistrationFormTest extends BaseClass {
	
	RegistrationFormPageObjects object ;
	
	
	@BeforeTest
	public void beforeTest() {
		
		BaseClass.initializeDriver();
		logger.info("before test");
	}
	
	//String fName, String lName, String phone, String email, String pass, String confpass
	
	@Test(dataProvider = "testData")
	public void test(String fName, String lName, String phone, String email, String pass, String confpass) throws InterruptedException {
		object = new RegistrationFormPageObjects();
		
		logger.info("data provider test");
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
	
	@Test
	public void test2() {
		
		System.out.println("h9i");
		Assert.assertTrue(false);
		logger.info("failed test");
	}
	@AfterTest
	public void afterTest() {
		BaseClass.tearDown();
		
		logger.info("tear down");
	}

}
