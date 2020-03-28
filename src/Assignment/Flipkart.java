package Assignment;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,20);
		driver.get("https://www.flipkart.com/");
		System.out.println("Launching Flipkart");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement txt=driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		txt.sendKeys("iphone");
		Actions a=new Actions(driver);
		List<WebElement> sugetion=driver.findElements(By.xpath("//a[@class='_2ja22P']/div[2]"));
		for(WebElement sug:sugetion)
		{
			System.out.println(sug.getText());
			
		}
		List<WebElement> suget=driver.findElements(By.xpath("//ul[@class='col-12-12 _1PBbw8']/li/div/a"));
		for(WebElement su:suget)
		{
			a.moveToElement(su);
			
		}
		System.out.println(sugetion.size());
		Thread.sleep(10000);
		System.out.println();
		driver.findElement(By.xpath("//ul[@class='col-12-12 _1PBbw8']/li[1]/div")).click();
		ww.until(ExpectedConditions.titleContains("Iphone"));
		driver.findElement(By.xpath("//div[@data-id='MOBEMK62PN2HU7EE']/descendant::img[@class='_1Nyybr  _30XEf0']")).click();;
		
		
	}

}
