package webdrivwercommandsSdet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switchbetweenalert {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\SAI\\Downloads\\chromedriver_win32 (1)//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		//1st method
	    driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
		//method 2
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        driver.switchTo().alert().accept();
		String ActText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
        System.out.println(ActText);
        String ExpText="You pressed Ok";
        
        if (ExpText.equals(ActText)==true) {
        	System.out.println("passed");
        }
        
        
        driver.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
        driver.switchTo().alert().dismiss();
		String AactText=driver.findElement(By.xpath("//*[@id=\"demo\"]")).getText();
        System.out.println(AactText);
        String EexpText="You Pressed Cancel";	
        if (EexpText.equals(AactText)==true) {
        	System.out.println("passed");
        }
        
        
        //method 3
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
        driver.switchTo().alert().sendKeys("Bapu");
        driver.switchTo().alert().accept();

    String  actt= driver.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
    System.out.println(actt);


        
	}

}
