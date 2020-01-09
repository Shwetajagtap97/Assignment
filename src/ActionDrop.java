import java.util.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class ActionDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Launching Browser");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("https://www.jqueryui.com/slider/");
		System.out.println("Launching JQuery");
		Thread.sleep(10000);
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement slider=driver.findElement(By.xpath("//div[@class='ui-slider ui-corner-all ui-slider-horizontal ui-widget ui-widget-content']"));
		Actions a= new Actions(driver);
		a.dragAndDropBy(slider, 50, 0).perform();
		Thread.sleep(1000);
		System.out.println("Sliding Done");
		
		

	}

}
