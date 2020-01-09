package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qsp.pom.Scen11;
import org.testng.annotations.Test;

import Test.SaveScreenShot;

public class Scenario11 {
	@Test
	public void Demo() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,70);
		driver.get("https://www.bluestone.com/");	
		Scen11 s=new Scen11(driver);
		s.sendTxt("Ring");
		s.clickButton();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(10000);
		SaveScreenShot.screenShot(driver, "S11ScrollDwn");
		Thread.sleep(10000);
		s.topclick();
		Thread.sleep(10000);
		SaveScreenShot.screenShot(driver, "S11ScrollTop");
		driver.close();
	}
}
