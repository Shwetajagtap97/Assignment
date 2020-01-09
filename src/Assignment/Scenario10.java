package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qsp.pom.Scen10;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Test.SaveScreenShot;

public class Scenario10 {
	@Test
	public void Demo() throws InterruptedException, IOException
	{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");	
		Scen10 s=new Scen10(driver);
		s.sendTxt("Ring");
		s.clickButton();
		SaveScreenShot.screenShot(driver, "S10ss1");
		s.mouseOver(driver);
		Thread.sleep(10000);
		SaveScreenShot.screenShot(driver, "S10ss2");
		Reporter.log(s.getCount(), true);
		driver.close();
		
	}

}
