package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignement1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	/*//first ass1
	 	driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
//driver.manage().deleteAllCookies();
		String Actual_Title = driver.getTitle();
		System.out.println(Actual_Title);
		String Exp_Title = "Facebook – log in or sign up";

		if (Exp_Title.equals(Actual_Title) == true) {
			System.out.println("passed");
		}
		else {
			System.out.println("not passed");
		}
		*/
		
		//First ass2
		driver.get("https://www.formsite.com/");
		
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Features")).click();
		driver.navigate().back();
		
		
		
		
		

	}

}
