package edureka;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 String baseURL="https://www.facebook.com/login/";
//		 String chromeproperty="webdriver.chrome.driver";
//		 String chromelocation="C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe"; 
//		 System.setProperty(chromeproperty, chromelocation);
//	     WebDriver driver=new ChromeDriver();
//		 driver.get(baseURL);
		
		
		String baseurl="https://login.yahoo.com";
		String chromeproperty="webdriver.chrome.driver";
		String chromelocation="C:\\Users\\SAI\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty(chromeproperty, chromelocation);
		WebDriver driver=new ChromeDriver();
		
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get(baseurl);
		
	//	driver.findElement(By.name("email")).sendKeys("bapuj94@gmail.com");
		
	//	driver.findElement(By.id("loginbutton")).click();
		//driver.findElement(By.linkText("Forgotten password?")).click();
	//	driver.navigate().back();
	
	
		
		
		//yahoo x path
		//driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("edureka@yahoo.com");
		//driver.findElement(By.xpath("//input[@id='login-signin']")).click();
		 //
		
		//cssselector
		driver.findElement(By.cssSelector("#login-signin")).click();
		driver.findElement(By.partialLinkText("login")).click();
		
		
		

		
		
		
		
	
		
		
	}

}
