package tests;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import core.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(utils.Listeners.class)
public class Assertions_Hard extends BaseClass{

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

	//	System.out.println(Actual_title);
		
		String expected_title = "Maven Repository: Search/Browse/Explore";
		
		Assert.assertEquals(Actual_title, expected_title);
		
		logger.info("test 1");
		
		System.out.println("it is assertion example");
		System.out.println("it is assertion example");
	}

	@Test
	public void test2() {
		
		String Actual_title = driver.getTitle();
		String expected_title = "Maven Repository: Search/Browse/Explore";
		
		Assert.assertEquals(Actual_title, expected_title);
		
		System.out.println("it is hard assertion example");
		System.out.println("it is hard assertion example");
		
		logger.info("test 2");
	}

	public void afterTest() {

	}

}
