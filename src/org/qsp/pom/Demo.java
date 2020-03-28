package org.qsp.pom;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo {
	public static void main(String agrs[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Actions a= new Actions(driver);
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		for(WebElement list:menu)
		{
			a.moveToElement(list).perform();
			Thread.sleep(10000);
		}	
		driver.close();
	}

	
}


