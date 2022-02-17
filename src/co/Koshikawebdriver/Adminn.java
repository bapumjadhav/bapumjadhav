package co.Koshikawebdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Adminn {

	String chromedriver = "webdriver.chrome.driver";
	String Chromelocation = "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;

	@SuppressWarnings("deprecation")
	@Test(enabled = true)
	public void login1() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
//imp   use x path for mouse over here
		WebElement admin = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewAdminModule\"]/b"));//only xpath works here
		WebElement um = driver.findElement(By.xpath("//*[@id=\"menu_admin_UserManagement\"]"));//here also only xpath 
		WebElement job = driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"));//only x path

		WebElement subt = driver.findElement(By.xpath("//*[@id=\"menu_admin_viewJobTitleList\"]"));

		Actions act = new Actions(driver);
		act.moveToElement(admin).moveToElement(um).moveToElement(job).moveToElement(subt).click().build().perform();

		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectAll\"]"));
		System.out.println(checkbox.isDisplayed());
		System.out.println(checkbox.isEnabled());
		System.out.println(checkbox.isSelected());
		if (checkbox.isSelected()) {
			System.out.println("checkbox is already selected");
		} else {
			checkbox.click();
		}

	}

 

}
