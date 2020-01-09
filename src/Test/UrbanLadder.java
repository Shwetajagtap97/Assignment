package Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		driver.get("https://www.urbanladder.com/");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//ul/li/a[contains(.,'Stores')]")).click();
		Thread.sleep(10000);
		List<WebElement> img=driver.findElements(By.xpath("//div[@class='_12wcw']"));
		for(WebElement el:img)
		{
			System.out.println(el.getText());
		}
		
		

	}

}
