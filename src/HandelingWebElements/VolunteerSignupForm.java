package HandelingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class VolunteerSignupForm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();

		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input")).sendKeys("bapu");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input")).sendKeys("jadhav");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea")).sendKeys("hello");
		driver.findElement(By.xpath("//*[@id=\"eid\"]/input")).sendKeys("bapuj99");
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[4]/div/input")).sendKeys("123456");
		//radio button
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).isSelected();
		driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input")).click();
         //check boxes
		driver.findElement(By.id("checkbox2")).click();
		
		//multiple delect
		driver.findElement(By.id("msdd")).click();
		driver.findElement(By.linkText("English")).click();
		driver.findElement(By.linkText("Finnish")).click();
		
		driver.findElement(By.id("secondpassword")).click();
		
		
		//dropdown
		WebElement y=driver.findElement(By.id("Skills"));
		Select s=new Select(y);
	//	s.selectByIndex(2);
		//s.selectByVisibleText("");    
        s.selectByValue("Adobe InDesign");//html code value
		
		//counrtry
		
	driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[10]/div/span/span[1]/span")).click();
	driver.findElement(By.xpath("/html/body/span/span/span[1]/input")).sendKeys("united");
	Actions act =new Actions(driver);
      act.sendKeys(Keys.ENTER).perform();
	// 

	}

}
