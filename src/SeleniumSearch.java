import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.DevSelenium;
import org.qsp.pom.FlipkartSearch;

public class SeleniumSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://selenium.dev/");
		DevSelenium fs=new DevSelenium(driver);
		fs.sendTxt("testing");
		
		Thread.sleep(10000);
		driver.navigate().back();
		Thread.sleep(10000);
		fs.sendTxt("java");
		

	}

}
