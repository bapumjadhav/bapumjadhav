package co.Koshikawebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

	public static void main(String[] args) throws InterruptedException {
		 String baseurl="https://www.facebook.com";
		  String chromeproperty="webdriver.chrome.driver";
		  String chromelocation="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
		  System.setProperty(chromeproperty, chromelocation);
		  WebDriver driver=new ChromeDriver();
		  driver.get(baseurl);
		  
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  Thread.sleep(3000);
		  
		  
		driver.get("baseurl");
				driver.findElement(By.xpath("//input[@name='sign_up']")).click();
				Actions act=new Actions(driver);
				act.sendKeys("xyz").perform();	
				Thread.sleep(3000);
				act.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).perform();
				Thread.sleep(3000);
				
				act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).perform();
				act.sendKeys(Keys.TAB).sendKeys("6552243244").sendKeys(Keys.TAB).sendKeys(Keys.ARROW_LEFT).sendKeys(Keys.ARROW_RIGHT).perform();
				
	}

}
