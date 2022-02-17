package co.Koshikawebdriver;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\DELL\\Downloads\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		String text = driver.findElement(By.xpath("//span[@id='spanMessage']")).getText();
		
		if (text.equalsIgnoreCase("Username is invalid")) {
			System.out.println("Passed");
		}

		else {
			TakesScreenshot tksr = (TakesScreenshot) driver;
			File source = tksr.getScreenshotAs(OutputType.FILE);
			File target = new File("E:\\seleniumscreenshot\\bapu.png");
			FileHandler.copy(source, target);
		}

	}

}
