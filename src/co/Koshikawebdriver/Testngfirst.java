package co.Koshikawebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngfirst {
	String chromedriver="webdriver.chrome.driver";
	String Chromelocation="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;	
	
		@Test(enabled=true)
		public void getDriver() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("http://www.bapujadhav.in"); 
			 String actual=driver.getTitle();
			 String expected="Google";
			 Assert.assertEquals(actual,expected);
			
		}
		 @BeforeMethod(enabled=true) //to run case
	     public void login() {
			 System.out.println("login method");
			 Reporter.log("login successfully in site",false);
		 }
		@AfterMethod(enabled=true)
		 public void profile() {
			 System.out.println("profile method");
			 
		 }
		@BeforeSuite
		public void c1()
		{
			Reporter.log("c1:before class",true);
		}
		@AfterSuite
		public void c2() {
			Reporter.log("c2:after class",true);

		}
		@BeforeTest (enabled=false)//it will skip this method
		public void m1() {
			Reporter.log("m1 method",true);
	
		}
		@AfterTest
		public void m2() {
			Reporter.log("m2 method",true);
	
		}
		

}
