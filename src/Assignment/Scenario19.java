package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.qsp.pom.YatraPOM;
import org.testng.Reporter;
import org.testng.annotations.Test;

import Test.SaveScreenShot;

public class Scenario19 {
	@Test
	public void Yatra() throws InterruptedException, IOException{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com/");
		YatraPOM y=new YatraPOM(driver);
		y.From();
		y.selectDes();
		y.To();
		y.toDesc();
		y.clickCalendar();
		y.selecDate();
		y.retCalendar();
		y.rutDate();
		y.traveller();
		y.addAdult();
		Thread.sleep(1000);
		y.addChild();
		Thread.sleep(1000);
		y.addInfant();
		y.selBusiness();
		y.selEconomy();
		y.selPEconomy();
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "yatra");
		y.searchFlights();
		SaveScreenShot.screenShot(driver, "Flights");
		Thread.sleep(100000);
		driver.close();
	}

}
