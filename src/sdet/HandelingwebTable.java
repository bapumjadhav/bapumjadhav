package sdet;
//test case;;
//1) Login to orange hrm
//2)go to -admin-usermanagement-user
//3)Count the employees whose status is enabled in web table

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandelingwebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\DELL\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().window().maximize();
		
		//login
		driver.findElement(By.name("txtUsername")).sendKeys("admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_admin_viewAdminModule")).click();
		driver.findElement(By.id("menu_admin_UserManagement")).click();
		driver.findElement(By.id("menu_admin_viewSystemUsers")).click();
		
		 int rowcount=driver
				.findElements(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/table/tbody/tr")).size();//here total row size tr taken
		//here for  .findelements  because int type hencw "s" suffix is imp
		 
		 
		int statuscount =0;
		for (int i=1; i<=rowcount;i++ ) {//i=1 because employee starts from 1 row
			
			String status= driver.findElement(By.xpath("//*[@id=\"resultTable\"]/tbody/tr[" +i+ "]/td[5]")).getText();// stauss coloumn is 5 and is same for all emp only row is chang
		
			if(status.equals("Enabled")) {
				statuscount = statuscount + 1;
			}
		}
		System.out.println("no of employees enabled : "+statuscount );
		driver.close();
		
		

		
		

	}

}
