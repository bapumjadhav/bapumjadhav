package co.Koshikawebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
//priority plus alphabetical order followed while executing test cases
public class TestingScond {
	String chromedriver="webdriver.chrome.driver";
	String Chromelocation="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;	
	
		@Test(priority=-1,enabled=true)
		public void A() {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
			driver.get("http://www.google.co.in"); 
			 String actual=driver.getTitle();
			 String expected="Google";
			 Assert.assertEquals(actual,expected);
			 System.out.println();
		}
		 @Test(priority=1,enabled=true,invocationCount=4) //to run case
	     public void B() {
			 System.out.println("b method");
			 Reporter.log("login successfully in site",false);
			 //only on report bacause false
		 }
		@Test(priority=-10,enabled=true,invocationCount=4)
		 public void C() {
			 System.out.println("c method");
			 //print on console and report
		 }
		@Test(priority=5,enabled=true,invocationCount=2)
		public void D()
		{
			Reporter.log("d",true);
		}
		@Test(priority=5,enabled=true,invocationCount=3)
		public void E() {
			Reporter.log("e ",true);

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
	
		
	


