package Assignment;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.qsp.pom.RedBUSPOM;
import org.testng.annotations.Test;

import Test.SaveScreenShot;

public class RedBus {
	@Test
	public void redbus() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		RedBUSPOM rb=new RedBUSPOM(driver);
		rb.sendFrom("Pune");
		rb.sendTo("Banglour");
		rb.selOwardCal();
		rb.onwarDate();
		rb.selReturnCal();
		rb.next();
		rb.returnDate();
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "RedBus");
		rb.serachBus();
		Thread.sleep(10000);
		SaveScreenShot.screenShot(driver, "Buses");
		driver.close();
}
}