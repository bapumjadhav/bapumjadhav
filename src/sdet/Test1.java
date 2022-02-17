package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	driver.get("www.google.com");
	driver.get("www.newtours.demoaut.com");
	//driver.findElement(By.name("password")).sendKeys("mercury");driver.findElement(By.name("login")).click();
	}

}
