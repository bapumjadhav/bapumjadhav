package co.Koshikawebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://jqueryui.com/resizable/"); 
		 WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']")); 
		 Dimension sizeFrame = iframe.getSize(); 
		 System.out.println(sizeFrame); 
		 driver.switchTo().frame(iframe); 
		 WebElement dragPoint = driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]")); 
		 Actions act=new Actions(driver); 
		 //act.clickAndHold(dragPoint).moveByOffset(100, 80).perform(); 
		 act.dragAndDropBy(dragPoint, 100, 80).perform();	
		 
		 }

}
