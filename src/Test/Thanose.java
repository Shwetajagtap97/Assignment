package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Thanose {

	public static void main(String[] args) throws InterruptedException{
		int count=0;
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
		driver.get("https://www.google.com/");
		System.out.println("URL LOAD");
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("thanos",Keys.ENTER);
		WebElement res=driver.findElement(By.xpath("//div[@id='resultStats']"));
		System.out.println(res.getText());  
		List<WebElement>li=driver.findElements(By.xpath("//div[@class='srg']/div"));
		for(WebElement lis:li)
		{
			count++;
		}
		System.out.println(count);  
		Actions a=new Actions(driver);
		WebElement hand=driver.findElement(By.xpath("//div[@class='Z4Kand MyFLjb']/canvas[@class='c3yYr']"));
		Thread.sleep(100000);
		hand.click();
		System.out.println("Click on hand");
		Thread.sleep(50000);
		WebElement res2=driver.findElement(By.xpath("//div[@id='resultStats']"));
		System.out.println(res2.getText());
	}

}
