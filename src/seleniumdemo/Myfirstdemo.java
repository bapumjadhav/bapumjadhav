package seleniumdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myfirstdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//declaration and instantiation of objects/variable
 String baseURL="https://www.facebook.com/login/";
 String chromeproperty="webdriver.chrome.driver";
 String chromelocation="C:\\selenium\\chromedriver_win32 (1)\\chromedriver.exe";
 //to set Chrome browser property
 System.setProperty(chromeproperty, chromelocation);
 //Launch website
 WebDriver driver=new ChromeDriver();
 driver.get(baseURL);//url
 //driver.navigate().to(baseURL);//to next url
 //driver.navigate().back();//back from current page
// driver.navigate().refresh();
String result=driver.getPageSource();
boolean b=result.contains("login to facebook");
String title=driver.getTitle();
String Urll=driver.getCurrentUrl();


System.out.println(title);
System.out.println(result);
//System.out.println(viewPageSource);
System.out.println();

// driver.manage().window().maximize();
//driver.manage().window().minimize();
driver.close();

	}

}
