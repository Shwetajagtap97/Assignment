package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qsp.pom.Scen8;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Test.SaveScreenShot;

public class Scenario8 {
	@Test
	public void Demo() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,70);
		driver.get("https://www.bluestone.com/");	
		Scen8 s=new Scen8(driver);
		s.sendTxt("Ring");
		SaveScreenShot.screenShot(driver, "S8ss1");
		s.clickButton();
		SaveScreenShot.screenShot(driver, "S8ss2");
		s.mouseOver(driver);
		Thread.sleep(10000);
		SaveScreenShot.screenShot(driver, "S8ss3");
		Reporter.log(s.getCount(), true);
		driver.close();

}
}
