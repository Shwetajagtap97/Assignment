package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOpenMRS {
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
	public void webTableHandles(){
		driver.get("https://demo.guru99.com/test/table.html");
	}


}
