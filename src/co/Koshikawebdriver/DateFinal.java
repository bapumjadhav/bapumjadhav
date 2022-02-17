package co.Koshikawebdriver;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DateFinal {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.automationtesting.in/Datepicker.html");
		driver.findElement(By.id("datepicker1")).click();
		
		new WebDriverWait(driver,Duration.ofSeconds(5))
		.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.className("ui-datepicker-calendar")));
		
		String monthYearval =driver.findElement(By.className("ui-datepicker-title")).getText();
		
		System.out.println(monthYearval);//February 2021
		String month = monthYearval.split("")[0].trim();
		String year = monthYearval.split("")[1].trim();
		
		while(!(month.equals("June") && year.equals("2024"))) {
			driver.findElement(By.xpath("//*[text()='Next']")).click();
			 monthYearval =driver.findElement(By.className("ui-datepicker-title")).getText();
			
			System.out.println(monthYearval);//February 2021
			 month = monthYearval.split(" ")[0].trim();
			 year = monthYearval.split(" ")[1].trim();

		}
		driver.findElement(By.linkText("24")).click();

	}

		
		//public static void selectDate(String exDay, String exMonth, String exYear) {
		//	System.out.println(monthYearval);
			
		
	//}

}
