package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qsp.pom.Scenario6POM;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Test.SaveScreenShot;

public class Scenario6 {
	@Test
	public void Demo() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");	
		Scenario6POM s= new Scenario6POM(driver);
		s.sendTxt("Ring");
		s.clickButton();
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "S6ss1");
		s.mouseOver(driver);
		Thread.sleep(10000);
		SaveScreenShot.screenShot(driver, "S6ss2");
		s.clickBelow();
		Thread.sleep(1000);
		String str=String.valueOf(s.getCountb());
		Reporter.log(str, true);
		driver.close();
		
	}

}
