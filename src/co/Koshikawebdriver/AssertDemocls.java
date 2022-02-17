package co.Koshikawebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AssertDemocls {

	public class Assignment2 {
		String chromedriver="webdriver.chrome.driver";
		String Chromelocation="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
		WebDriver driver;	
		

		@Test(priority = 1)
		public void LanchUrl3() {
			System.setProperty(chromedriver, Chromelocation);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com");
		}

	}}


