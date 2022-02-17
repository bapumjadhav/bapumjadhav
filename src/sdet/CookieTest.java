package sdet;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		Set <Cookie>cookies=driver.manage().getCookies();//get all cookies
		System.out.println("Total cookies ="+ cookies.size());
		for(Cookie cookie: cookies)//read and print all cookies
		{
			System.out.println(cookie.getName()+" : "+ cookie.getValue());//print name and values of cookies
		}
		//get cookie using name
		System.out.println(driver.manage().getCookieNamed("session-id-time"));
       // add new cookie to browser
		Cookie obj=new Cookie("my cookie","1234");
		driver.manage().addCookie(obj);
		Set <Cookie>cookies1=driver.manage().getCookies();//get all cookies
		System.out.println("Total Cookies after adding cookies : "+cookies1.size());
        System.out.println(driver.manage().getCookieNamed("my cookie"));
		//delete specific cookie
		//driver.manage().deleteCookie(obj);
		  //delete all cokkies
	    driver.manage().deleteAllCookies();
		Set <Cookie>cookies2=driver.manage().getCookies();//get all cookies
		System.out.println("size of cookies :" + cookies2.size());//print size of all cookies

			driver.quit();
			
			
			
		
		
		
	}

}
