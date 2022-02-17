package co.Koshikawebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickpravin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		 driver.get("http://demo.automationtesting.in/Datepicker.html"); 
		 driver.findElement(By.id("datepicker1")).click(); 
		 String month;
		/* do { 
		 //System.out.println(month);
		 driver.findElement(By.xpath("//*[@id=\'ui-datepicker-div\']/div/a[1]/span")).click(); //prev
		 month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText(); //month and year
		System.out.println(month);
		 // i++;
		 } 
		 while(!(month.equalsIgnoreCase("January 2019"))); 
		 driver.findElement(By.xpath("//a[text()='15']")).click();
		*/
		 
		 do { 
			 //System.out.println(month);
			 driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/a[1]/span")).click(); //previous button 
			 month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText(); //month and year text
			System.out.println(month);
			 // i++;
			 } 
			 while(!(month.equalsIgnoreCase("January 2019"))); 
			 driver.findElement(By.xpath("//a[text()='15']")).click();//daTE
	}
	
	}


