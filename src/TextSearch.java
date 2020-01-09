import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.qsp.pom.FlipkartSearch;

public class TextSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		
		FlipkartSearch fs=new FlipkartSearch(driver);
		fs.sendTxt("iphone");
		fs.clickonButton();
		Thread.sleep(1000);
		
		driver.navigate().back();
		
		Thread.sleep(100000);
		fs.sendTxt("Books");
		fs.clickonButton();
		Thread.sleep(10000);
		
		
	}

}
