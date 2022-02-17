package co.Koshikawebdriver;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
ChromeDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://selenium08.blogspot.com/2019/07/alert-test.html");

//method 1 simple alert
/*driver.findElement(By.id("simple")).click();
Alert a=driver.switchTo().alert();
String bb=a.getText();
System.out.println(bb);
a.accept();
driver.close();*/

//method 2
driver.findElement(By.id("confirm")).click();
Alert a=driver.switchTo().alert();
String bb=a.getText();
System.out.println(bb);
a.accept();
String status=driver.findElement(By.id("demo")).getText();
System.out.println(status);
driver.close();
//prompt alert sir refer

	};

}
