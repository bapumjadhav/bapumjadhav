package Assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {  
		  int i;
		  String Jadhav;
	    
	    	@Test(enabled=true,priority=1)
	    	public void getdriver() {
	        System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");  
	        WebDriver driver = new ChromeDriver();  
	        driver.navigate().to("http://demo.automationtesting.in/Register.html");
	      System.out.println(  driver.getTitle());
	       
	        Assert.assertFalse(driver.findElement(By.id("checkbox1")).isSelected(),"checkbox is not selected");  
	        Reporter.log("checkbox is not selected",true);  
	          
	        driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).click();
	        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"checkbox2\"]")).isSelected(),"checkbox is  selected");  
	        Reporter.log("checkbox is  selected", true);  
	        
	        Assert.assertEquals(driver.getTitle(), "Register");  
	        Reporter.log("Actual and expected title matched",true); 
	        
	        Assert.assertNotEquals(driver.getTitle(), "Jadhav");  
	        Reporter.log("Actual and expected title not matched",true); 
	        
	        Assert.assertNull(Jadhav,"String is null ");  //string value is null
	        Reporter.log("object is null",true); 
	        
	        Assert.assertNotNull(i,"dafault value of int is 0");  
	        Reporter.log("object is not null",true); 
	    	}
	       
	    	
	    	@Test(priority=2)
	    	//soft assertion
	    	public void softaseert() {
	        SoftAssert sa=new SoftAssert();
	        sa.assertNull(Jadhav,"object is null");  
	        Reporter.log("object is null");//pass
	       // sa.assertNull(i,"not null");  
	      //  Reporter.log("object is not null");//fail
	        
	        
	        //sa.assertNotNull(Jadhav,"value is null");  
	       // Reporter.log("object is null"); //fail test
	        sa.assertNotNull(i,"dafault i value is 0 hence it is not null and hence pass test");  
	        Reporter.log("object is not  null"); //pass test
	        
	        
	        sa.assertAll();
	        
	    }

}
