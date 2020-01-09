package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Test.SaveScreenShot;

public class Amazon {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		SaveScreenShot.screenShot(driver, "Amazon0");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "Amazon1");
		js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "Amazon2");
	}

}
