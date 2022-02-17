package co.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Orangehrm {
	public class Assignment1 {
		String chromedriver="webdriver.chrome.driver";
		String Chromelocation="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
		WebDriver driver;	
		

		@Test(priority = 1)
		public void LanchUrl() {
			System.setProperty(chromedriver, Chromelocation);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://opensource-demo.orangehrmlive.com");
		}

		@Test(priority = 2)
		public void signin() {
			driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
			driver.findElement(By.xpath("//input[@name='Submit']")).click();
		}

		@Test(priority = 3)
		public void DatePicker1() {
			driver.findElement(By.xpath(" //a[@id='menu_leave_viewLeaveModule']")).click();
			driver.findElement(By.xpath("//a[@id='menu_leave_viewMyLeaveList']")).click();
			driver.findElement(By.xpath("//*[@id=\'frmFilterLeave\']/fieldset/ol/li[1]/img")).click();
			WebElement year = driver.findElement(By.xpath("//select[@data-handler='selectYear']"));
			Select sec1 = new Select(year);
			sec1.selectByValue("2020");
			WebElement month = driver.findElement(By.xpath(" //select[@data-handler='selectMonth'] "));
			Select sec = new Select(month);
			sec.selectByValue("0");
			driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[5]/td[5]/a")).click();
		}

		@Test(priority = 4)
		public void DatePicker2() {
			driver.findElement(By.xpath("//*[@id=\'frmFilterLeave\']/fieldset/ol/li[2]/img")).click();
			WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
			Select sec1 = new Select(year);
			sec1.selectByValue("2022");
			WebElement month = driver.findElement(By.xpath(" //select[@class='ui-datepicker-month'] "));
			Select sec = new Select(month);
			sec.selectByValue("1");
			driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/table/tbody/tr[2]/td[4]/a")).click();
		}

		@Test(priority = 5)
		public void click_search() {
			driver.findElement(By.xpath("//*[@name='btnSearch']")).click();
		}
		@Test(priority = 6)
		public void close_driver() throws InterruptedException {
			Thread.sleep(5000);
			driver.close();
		}
		@Test(priority = 7)
		public void Quite() throws InterruptedException {
		Thread.sleep(5000);
		driver.close();
		}
	}
}
