package sdet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DatepickerPravin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
				
				driver.get("https://demoqa.com/automation-practice-form");
				driver.manage().window().maximize();
				
		
		
		
		
		driver.get("https://demoqa.com/automation-practice-form");
        driver.manage().window().maximize();
        driver.findElement(By.id("firstName")).sendKeys("pravin");
        driver.findElement(By.id("lastName")).sendKeys("nikam");
        driver.findElement(By.id("userEmail")).sendKeys("pravindnikam123@gmail.com");
        driver.findElement(By.xpath("//*[@id=\"genterWrapper\"]/div[2]/div[1]/label")).click();
        driver.findElement(By.xpath("//*[@id=\"userNumber\"]")).sendKeys("7066466056");
        Actions act=new Actions(driver); 
        act.sendKeys(Keys.TAB).perform();
      
        WebElement month =driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/select")); 
        Select sec=new Select(month);
        sec.selectByValue("2");
        WebElement year=driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[1]/div[2]/div[2]/select"));
        Select sec1=new Select(year);
        sec1.selectByValue("1997");
       driver.findElement(By.xpath("//*[@id=\"dateOfBirth\"]/div[2]/div[2]/div/div/div[2]/div[2]/div[5]/div[7]")).click();

	}

}
