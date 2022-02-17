package co.Koshikawebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatepickerDropd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");
		 driver.get("https://mbasic.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.name("sign_up")).click();

		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Akash");

		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patil");

		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pati l.akash@gmail.com");
		driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
		
		List<WebElement> days = driver.findElements(By.xpath("//select[@name='birthday_day']//option"));
		for (WebElement day : days) {
			String d = day.getText();
			if (d.equals("10")) {
				day.click();
			}
		}

		List<WebElement> months = driver.findElements(By.xpath("//select[@name='birthday_month']//option"));
		for (WebElement month : months) {
			if (month.getText().equals("Dec")) {
				month.click();
			}
		}
		List<WebElement> years = driver.findElements(By.xpath("//select[@name='birthday_year']//option"));
		for (WebElement year : years) {
			if (year.getText().equals("2007")) {
				year.click();
			}
		}

		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("hel lo");
		// driver.findElement(By.xpath("//input[@name='submit']")).click();

	}

}
