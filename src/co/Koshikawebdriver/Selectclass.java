package co.Koshikawebdriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/");  
		driver.findElement(By.xpath("//input[@name='txtUsername' and  @type='text']")).sendKeys("Admin"); 
		 
		 driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123 "); 
		 WebElement loginBtn = driver.findElement(By.xpath("//*[contains(@id,'btn')]"));  
		 loginBtn.click(); 
		 
		 driver.findElement(By.xpath("//a[@href='/index.php/leave/assignLeave']//img ")).click(); 
		 WebElement leave = driver.findElement(By.xpath("//select[@id='assignleave_txtLeaveType']"));  
		
		 Select sec=new Select(leave);//One argument constructor of select class get initialized 
		 sec.selectByValue("4");//used to select dropdown value by using value attribute   Thread.sleep(2000);   sec.selectByVisibleText("CAN - Vacation");   Thread.sleep(2000);   sec.selectByIndex(6); System.out.println(sec.isMultiple());//we can not select multiple options 
	
		  List<WebElement>options_leave = sec.getOptions();  
		  
		  for(WebElement option:options_leave)   {  
			  String option_text = option.getText();  
			  System.out.println(option_text);
		  }
	}

}
