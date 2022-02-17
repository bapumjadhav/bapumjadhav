package co.Koshikawebdriver;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByJe {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		
		driver.get("https://opensource-demo.orangehrmlive.com");
		JavascriptExecutor js = (JavascriptExecutor)driver;//Type casting of driver//Upcasting  
		js.executeScript("window.scrollBy(0,200)");//For scrolling in downward direction  
		Thread.sleep(3000); 
		js.executeScript("window.scrollBy(0,-600)");//for scrolling in upword direction 
		String domain = js.executeScript("return document.domain;").toString();  
		System.out.println(domain);  
		js.executeScript("window.location='https://www.facebook.com/'");  
		
		//js.executeScript("alert('welcome to site');");  
		//We can perform click operation on web element
		//  WebElementfogotPassword = driver.findElement(By.linkText("Forgot your password?"));
		//  System.out.println(fogotPassword.isEnabled());
		//  js.executeScript("arguments[0].click();",fogotPassword);
		//arguments[0]: it will refer the particular web element given as argument   
	
		
		
		
		
	}

}
