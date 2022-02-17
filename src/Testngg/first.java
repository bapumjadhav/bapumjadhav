package Testngg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class first {

	 String chromeproperty="webdriver.chrome.driver";
	 String chromelocation="C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe";
	 public WebDriver driver;
	//@Test
	   public void verifyTitle() throws InterruptedException{
		System.out.println("chrome launching");
		System.setProperty(chromeproperty,chromelocation);
		driver=new ChromeDriver();
		driver.get("https://www.google.com");
		String expectedTitle="Google";
		String actualTitle=driver.getTitle();
		
		Assert.assertEquals(actualTitle,expectedTitle);
		
		Thread.sleep(3000);
		driver.close();
		
		
		
	}
}
