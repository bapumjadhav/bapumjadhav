package co.Koshikawebdriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SelectClassassign {
		String chromedriver="webdriver.chrome.driver";
		String Chromelocation="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
		WebDriver driver;	
		@Test(enabled=true,priority=1)
		public void login() throws InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
	        driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);

	        
	        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
	        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	        driver.findElement(By.id("btnLogin")).click();
	        
	        driver.findElement(By.xpath("//*[@id=\"menu_leave_viewLeaveModule\"]/b")).click();
	        driver.findElement(By.xpath("//*[@id=\"menu_leave_assignLeave\"]")).click();
	      WebElement Types=  driver.findElement(By.xpath("//*[@id=\"assignleave_txtLeaveType\"]"));
              Select select=new Select(Types);
             System.out.println( select.getOptions());
            System.out.println(Types.getSize()); 
            
            select.selectByValue("8");
            
            //calender
           driver.findElement(By.xpath("//*[@id=\"assignleave_txtFromDate\"]")).click();
    		
    		List<WebElement> years = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
    		for (WebElement year : years) {
    			if (year.getText().equals("2022")) {
    				year.click();
    			}
    		}
    		List<WebElement> months = driver.findElements(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
    		for (WebElement month : months) {
    			if (month.getText().equals("Feb")) {
    				month.click();
    			}
    		}
    		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[5]/a")).click();
              
		}
		
//	       @Test
//	        public void MyJob() {
//		      
//                 driver.findElement(By.xpath("//*[@id=\'menu_admin_viewAdminModule\']/b")).click();
//                 //driver.findElement(By.xpath()).click();
//
//                 WebElement Job=driver.findElement(By.linkText("Job"));
//                /* Select select =new Select(Job);
//                 //select.deselectByValue("");
//                 select.selectByValue("Job Titles");*/
//                 
//                 Actions act=new Actions(driver);
//                 act.moveToElement(Job).build().perform();
//                 Job.click();
//                 
//				 
//			 }
//			
//		
	


	
		
}
