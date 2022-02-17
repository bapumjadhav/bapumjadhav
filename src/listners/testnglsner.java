package listners;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.ITestListener;
import org.testng.annotations.Test;

public class testnglsner implements ITestListener{

	String chromedriver="webdriver.chrome.driver";
	String Chromelocation="C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;	
	

	@Test(priority = 1)
	public void LanchUrrl1() {
		System.setProperty(chromedriver, Chromelocation);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com");
	}

	@Test(priority = 2)
	public void signin111() {
		driver.findElement(By.xpath("//input[@name='txtUsername']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
	}

	@Test(priority = 3)
	public void Requirement() {
		driver.findElement(By.xpath("//*[@id=\"menu_recruitment_viewRecruitmentModule\"]/b")).click();
	
	}
	@Test(priority = 4)
	public void Selectt() {
	WebElement Job_Title=	driver.findElement(By.xpath("//*[@id=\"candidateSearch_jobTitle\"]"));
		Select sec=new Select(Job_Title);
		sec.selectByIndex(2);
		WebElement HiringManager=driver.findElement(By.xpath("//*[@id=\"candidateSearch_hiringManager\"]"));
		Select sec1=new Select(HiringManager);
		sec1.selectByIndex(2);
		driver.findElement(By.id("candidateSearch_keywords")).sendKeys("123");
	}


	
	@Test(priority = 5)
	public void DatePicker11() {
		driver.findElement(By.xpath("//*[@id=\"frmSrchCandidates\"]/fieldset/ol/li[7]/img")).click();
		WebElement year = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[2]"));
		Select sec1 = new Select(year);
		sec1.selectByValue("2020");
		WebElement month = driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div/div/select[1]"));
		Select sec = new Select(month);
		sec.selectByValue("0");
		driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/table/tbody/tr[2]/td[6]/a")).click();
	}
	
	@Test(priority = 6)
	public void Checkbox1() {
		driver.findElement(By.xpath("//*[@id=\"ohrmList_chkSelectRecord_7_4\"]")).click();
		
		}
	}


