package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		System.out.println("URL LOAD");
		driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("shwetajagtap99@gmail.com");	
		System.out.println("UerID send");
		driver.findElement(By.xpath("//div[@id='identifierNext']")).click();
		System.out.println("UerID send");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("992207214");
		System.out.println("UerID send");
		driver.findElement(By.xpath("//div[@id='passwordNext']")).click();
		System.out.println("Password send");
		
		

	}

}
