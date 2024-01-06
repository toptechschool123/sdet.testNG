package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assertions_Soft {
	
	
	SoftAssert softassert = new SoftAssert();


	public WebDriver driver;

	@BeforeTest
	public void beforeTest() {

		WebDriverManager.chromedriver().setup();

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");

		driver = new ChromeDriver(options);

		driver.get("https://mvnrepository.com/");

	}

	@Test
	public void test1() {

		String Actual_title = driver.getTitle();

	
		
		String expected_title = "Maven Repository: Search/Browse/Explore22";
		
		softassert.assertEquals(Actual_title, expected_title);
		
		
		
		System.out.println("it is soft assertion example");
		System.out.println("it is soft assertion example");
		
		softassert.assertAll();
	}

	
	public void test2() {
		
		String Actual_title = driver.getTitle();
		String expected_title = "Maven Repository: Search/Browse/Explore";
		
		
		
		System.out.println("it is hard assertion example");
		System.out.println("it is hard assertion example");
	}

	public void afterTest() {

	}

}
