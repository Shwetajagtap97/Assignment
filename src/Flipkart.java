import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		System.out.println("Launching Flipkart");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		List<WebElement> menu=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		Actions a=new Actions(driver);		
		for(WebElement item: menu)
		{
			System.out.println(item.getText());
			String name = item.getText();
			a.moveToElement(item).build().perform();
			Thread.sleep(100000);
			List<WebElement> submenu = driver.findElements(By.xpath("//span[contains(.,'"+name+"')]/parent::li/descendant::ul[@class='QPOmNK']/li"));
			System.out.println(submenu.size());
			for (WebElement it : submenu) {
				System.out.println(item.getText());
				
			}
		}
		System.out.println("End");
		WebElement e=driver.findElement(By.xpath("//span[contains(.,'Electronics')]"));
		a.moveToElement(e).perform();
		List<WebElement> submenu = driver.findElements(
				By.xpath("//span[contains(.,'Electronics')]/parent::li/descendant::li"));
		for (WebElement it : submenu) {
			System.out.println(it.getText());
			
		}
		
	}

}


