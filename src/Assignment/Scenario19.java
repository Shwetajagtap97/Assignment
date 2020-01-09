package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.YatraPOM;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Scenario19 {
	@Test
	public void Yatra(){
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
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
		
	}

}
