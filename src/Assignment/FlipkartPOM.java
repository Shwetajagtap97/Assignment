package Assignment;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.qsp.pom.FlipkartSearch;

public class FlipkartPOM {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		FlipkartSearch fs=new FlipkartSearch(driver);
		Actions a=new Actions(driver);
		fs.mousover(a);
		Thread.sleep(1000);
		fs.clickMi();
		Thread.sleep(1000);
		fs.clickImg();
		Thread.sleep(1000);
		Set<String> win=driver.getWindowHandles();
		for(String child:win)
		{
			driver.switchTo().window(child);
		}
		FlipkartSearch fs1=new FlipkartSearch(driver);
		fs1.clickAdd();

	}

}
