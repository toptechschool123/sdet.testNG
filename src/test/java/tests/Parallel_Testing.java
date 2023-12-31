package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parallel_Testing {

	@Test
	public void test1() {
		
		
	WebDriverManager.chromedriver().setup();
	WebDriver driver =  new ChromeDriver();
	driver.get("https://www.google.com/");
		

	}
	@Test
	public void test2() {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =  new EdgeDriver();
		driver.get("https://www.facebook.com/");

	}
	@Test
	public void test3() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver =  new FirefoxDriver();
		driver.get("https://www.instagram.com");
	}
	@Test
	public void test4() {
		WebDriverManager.safaridriver().setup();
		WebDriver driver =  new SafariDriver();
		driver.get("https://testng.org/doc/documentation-main.html#parallel-tests");

	}
}
