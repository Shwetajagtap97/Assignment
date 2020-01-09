package Nisha;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropebal {

	public static void main(String[] args)throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",".\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	System.out.println("Lounchingbrowser");
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	Thread.sleep(10000);
	System.out.println("Facebook");
	driver.findElement(By.xpath("//select[@id='day']/option[contains(.,'20')]")).click();
	driver.findElement(By.xpath("//select[@id='month']/option[contains(.,'Jan')]")).click();
	driver.findElement(By.xpath("//select[@id='year']/option[contains(.,'1997')]")).click();
	System.out.println("My Date slected ");
	Thread.sleep(1000);
	WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
	Select s = new Select(day);
	s.selectByValue("14");
	WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
	Select s2 = new Select(month);
	s2.selectByValue("2");
	WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));
	Select s3 = new Select(year);
	s3.selectByValue("1995");
	
	

	}

}
