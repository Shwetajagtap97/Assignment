package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.qsp.pom.Scen20;
import org.qsp.pom.YatraPOM;
import org.testng.annotations.Test;

public class Scenario20 {
	@Test
	public void Sen() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider");
		Thread.sleep(2000);
		Scen20 s = new Scen20(driver);
		s.swtichFrame(driver);
		Thread.sleep(1000);
		s.sild(driver);
		Thread.sleep(1000);
		s.sildrevers(driver);
		Thread.sleep(1000);
		s.sild(driver);
		Thread.sleep(1000);
		s.sildrevers(driver);
		Thread.sleep(1000);
		s.sild(driver);
		Thread.sleep(1000);
		s.sildrevers(driver);
	}

}
