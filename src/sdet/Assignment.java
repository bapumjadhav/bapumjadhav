package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://samruddhiagro.co.in/pages/customerlogin");
		driver.findElement(By.linkText("Register Now")).click();
		//method1 working
		//driver.findElement(By.xpath("//*[@id=\"mat-select-0\"]/div/div[2]")).click();
		//driver.findElement(By.xpath("//*[@id=\"mat-option-1\"]/span")).click();
//method2 not working
	WebElement yy=	driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]"));
	Select ss=new Select(yy);
	//ss.selectByVisibleText("Partner");
	ss.selectByIndex(2);
		
		
		
	}

}
