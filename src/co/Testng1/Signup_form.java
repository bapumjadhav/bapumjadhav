package co.Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;


public class Signup_form {

	String chromedriver = "webdriver.chrome.driver";
	String Chromelocation = "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe";
	WebDriver driver;

	@Test(priority = 2)
	public void LaunchUrl1() {
		System.setProperty(chromedriver, Chromelocation);
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
	}

	@Test(priority = 3)
	public void Register() {

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("bapu");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("jadhav");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("bapuj99");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("123456");
	}

	@Test(priority = 4)
	public void radio_button() {
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).isSelected();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
	}

	@Test(priority = 5)

	public void Check_box() {
		driver.findElement(By.id("checkbox2")).click();
		// multiple delect
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("Finnish")).click();

		driver.findElement(By.id("secondpassword")).click();

	}

	@Test(priority = 6)

	public void Drop_down() {
		driver.findElement(By.id("Skills")).click();
		WebElement y = driver.findElement(By.id("Skills"));
		Select z = new Select(y);
		z.selectByVisibleText("C");
		// z.selectByIndex(2);
		// z.selectByValue("");//html code value
	}

	@Test(priority = 7)
	public void ActionclassKey() {
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
		driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("india");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();

	}
    @Test(priority=8)
    public void Date_pick() {
    WebElement Year=	driver.findElement(By.xpath("//*[@id=\"yearbox\"]"));
    	Select sec=new Select(Year);
    	sec.selectByVisibleText("1997");
     WebElement Month=	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select"));
     	Select sec1=new Select(Month);
     	sec1.selectByVisibleText("June");
      WebElement Day=	driver.findElement(By.xpath("//*[@id=\"daybox\"]"));
  	     Select sec2=new Select(Day);
  	     sec2.selectByVisibleText("15");
  	    		 
     	
    }
//    @Test(priority = 9)
//	public void Quite() throws InterruptedException {
//	Thread.sleep(5000);
//	driver.close();
//	}

}
