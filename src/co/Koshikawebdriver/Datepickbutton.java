package co.Koshikawebdriver;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickbutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://demo.automationtesting.in/Datepicker.html");  
		
		driver.findElement(By.id("datepicker1")).click();  
		
		String Month;//this matters a lot remember it//we declare it as global variable String we used it in do and while
		
		do {       
		
			driver.findElement(By.xpath("//*[text()='Prev']")).click();  
			 Month=driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div")).getText(); 
		     System.out.println(Month);
			} 
			
	 while(!(Month.equalsIgnoreCase("January 2020")));  
			driver.findElement(By.xpath("//a[text()='15']")).click(); 
			  }
	}
	


