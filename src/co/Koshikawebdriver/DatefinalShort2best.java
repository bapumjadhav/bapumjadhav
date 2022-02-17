package co.Koshikawebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class DatefinalShort2best {
	
	
@Test
	public  void Datep() {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.id("datepicker1")).click();
		
		new WebDriverWait(driver,Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		////naveen automation lab   last
		
	selectDate1("1", "February", "2021");
	}
		public static String[] getMonthYear(String monthYearVal) {
			return monthYearVal.split(" ");
		}
@Test
		public static void  selectDate1(String Day, String Month, String Year) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver driver=new ChromeDriver();

			String monthYearVal =driver.findElement(By.className("ui-datepicker-title")).getText();
	    	System.out.println(monthYearVal);
			String month = monthYearVal.split("")[0].trim();
			String year = monthYearVal.split("")[1].trim();
			
			while(!(month.equals("June") && year.equals("2024"))) {
				driver.findElement(By.xpath("//*[text()='Next']")).click();
				 monthYearVal =driver.findElement(By.className("ui-datepicker-title")).getText();
				
				System.out.println(monthYearVal);//February 2021
				 month = monthYearVal.split(" ")[0].trim();
				 year = monthYearVal.split(" ")[1].trim();
			}
			driver.findElement(By.linkText(" + Day + ")).click();
		
		}
		
	
}
