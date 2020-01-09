package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qsp.pom.Scen7;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Test.SaveScreenShot;

public class Scenario7 {
	@Test
	public void Demo() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,70);
		driver.get("https://www.bluestone.com/");	
		Scen7 s=new Scen7(driver);
		s.sendTxt("Ring");
		s.clickButton();
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "S7ss1");
		s.mouseOver(driver);
		Thread.sleep(10000);
		SaveScreenShot.screenShot(driver, "S7ss2");
		Reporter.log(s.getCount(), true);
		driver.close();

}
}
