package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependonMethod {
	String Baseurl = "https://opensource-demo.orangehrmlive.com";
	String chromepropery = "webdriver.chrome.driver";
	String chromelocation = "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;

   @Test(dependsOnMethods= {"Launch"}) 
	public void loginclick() {
		driver.findElement(By.id("btnLogin")).click();
        Reporter.log("login is successfull",true);
	}

	@Test
	public void Launch() {
		System.setProperty(chromepropery,chromelocation);
	    driver = new ChromeDriver();
		driver.get(Baseurl);
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
        Reporter.log("pass username and password successfully",true);

	}
}
