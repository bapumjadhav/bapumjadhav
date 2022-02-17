package co.Koshikawebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ppp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
	
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.findElement(By.name("txtUsername")).sendKeys("Admin");
        driver.findElement(By.name("txtPassword" )).sendKeys("admin123");
        driver.findElement(By.name("Submit")).click();
        Actions act=new Actions(driver);
        
       WebElement admin= driver.findElement(By.xpath(" //*[@id=\"menu_admin_viewAdminModule\"]/b"));
        WebElement job=driver.findElement(By.xpath("//*[@id=\"menu_admin_Job\"]"));
   // WebElement user= driver.findElement(By.linkText("https://opensource-demo.orangehrmlive.com/index.php/admin/viewJobTitleList"));
      
      act.moveToElement(admin).moveToElement(job).click().build().perform();
      
      
      
  
      
      
      /* int rowcount=driver.findElements(By.xpath("//*[@id='resultTable']/tbody/tr")).size();
        System.out.println(rowcount);
        int statuscount=0;
        for(int i=1;i<=46;i--) {
        	String status = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr[+i+]/td[5]")).getText();
        	if(status.equals("Enabled")) {
        		statuscount =statuscount+1;
        	}
        }System.out.println("no of employess Enaabled"+statuscount);
        driver.quit();
	}*/
	}

}
