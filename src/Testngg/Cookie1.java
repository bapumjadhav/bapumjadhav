package Testngg;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Cookie1 {

	String chromeproperty="webdriver.chrome.driver";
	String chromelocation="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;
	
		@Test(priority = 1)
		public void Launch_url() {
			System.setProperty(chromeproperty, chromelocation);
			driver = new ChromeDriver();
			driver.get("https://www.amazon.in/");
		}

		@Test(priority = 2)
		public void Find_cookie() {
			Set<Cookie> cookies = driver.manage().getCookies();
			System.out.println("Total cookies  " + cookies.size());
			for (Cookie cookie : cookies) {
				System.out.println(cookie.getName() + " : " + cookie.getValue());
			}
		}

		@Test(priority = 3)
		public void Add_cookie() {
			
			Cookie cobj = new Cookie("my cookie", "12345");
			driver.manage().addCookie(cobj);
			Set<Cookie> cookies1 = driver.manage().getCookies();
			System.out.println("Total cookies after adding cookies  " + cookies1.size());
		}

		@Test(priority = 4)
		public void deleate_cookies() {
			
			driver.manage().deleteAllCookies();
			Set<Cookie> cookies2 = driver.manage().getCookies();
			System.out.println("Total cookies after deleating cookies  " + cookies2.size());
		}
		
		


	}


