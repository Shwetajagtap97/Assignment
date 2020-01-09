package Nisha;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loadurl {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver",".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Launching Browser");
		Thread.sleep(10000);
		driver.get("https://www.google.com");
		System.out.println("Launching google");
		Thread.sleep(10000);
		WebElement txt = driver.findElement(By.name("q" ));
		txt.sendKeys("java", Keys.ENTER);
		
	
		
		
		
		
	}

}
