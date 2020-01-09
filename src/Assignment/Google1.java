package Assignment;

import org.openqa.selenium.*;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import Test.SaveScreenShot;

public class Google1 {

		public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement txt=driver.findElement(By.xpath("//a[text()='हिन्दी']"));
		driver.findElement(By.name("q")).sendKeys(txt.getText());
		String str="Google";
		SaveScreenShot.screenShot(driver, str);
		
		//TakeScreenShotAndSave.screenShot(driver,str);
		List<WebElement> lis=driver.findElements(By.xpath("//li[@class='sbct']"));
		for(WebElement str1:lis)
		{
			System.out.println(str1.getText());
			Thread.sleep(1000);
		}
		Thread.sleep(1000);
		System.out.println("End");
		//driver.findElement(By.xpath("//span[text()='हिन्दी चुटकुले']")).click();
		

	}

}