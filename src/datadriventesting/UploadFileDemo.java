package datadriventesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class UploadFileDemo {

	String chromedriver="webdriver.chrome.driver";
	String chromelocation="C:\\Users\\Lenovo\\eclipse-workspace\\DataDrivenDemo\\chromedriver\\chromedriver.exe";
	WebDriver driver;
	
	@Test
	public void uploadFile() {
		
		System.setProperty(chromedriver, chromelocation);
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/FileUpload.html");
		WebElement web=driver.findElement(By.id("input-4"));
		web.sendKeys("C:\\Users\\Lenovo\\Desktop\\ExportExcel.xlsx");//filelocation
		
	}
}
