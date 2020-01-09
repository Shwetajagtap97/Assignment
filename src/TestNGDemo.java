import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGDemo {
	static WebDriver driver;
	@BeforeMethod
	public void BeforeMethod()
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	}
	@Test
	public void demo(){
	driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);;
	Reporter.log("Demo",true);
	}
	@Test
	public void demo1(){
	driver.findElement(By.name("q")).sendKeys("Selenium",Keys.ENTER);;
	Reporter.log("Demo1",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		driver.close();
	}
	
}
