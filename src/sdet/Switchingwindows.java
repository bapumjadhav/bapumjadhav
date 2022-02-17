package sdet;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Switchingwindows {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.manage().window().maximize();
		
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"Seperate\"]/button")).click();
	
		Set <String>s=driver.getWindowHandles();//get id of windows in string 
		
		for(String i:s) {
			//System.out.println(i);//id of windows
			String t= driver.switchTo().window(i).getTitle();//get title of each in loop1 after 2
			if(t.equals("Frames & windows")) {
				driver.close();
			}
			
		}
	
		
		
	}

}
