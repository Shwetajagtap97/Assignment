import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Myntra {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.myntra.com/");
		System.out.println("Launching Myntra");
		Thread.sleep(10000);
		List<WebElement> menu = driver.findElements(By.xpath("//div[@class='desktop-navLinks']/div"));
		Actions a = new Actions(driver);
		Thread.sleep(10000);
		for (WebElement item : menu) {
			System.out.println();
			System.out.println(item.getText());
			String name = item.getText();
			String res = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
			System.out.println("String:" + res);
			a.moveToElement(item).build().perform();
			Thread.sleep(10000);
			List<WebElement> submenu=driver.findElements(By.xpath(
					 "//a[contains(.,'"+name+"')]/parent::div[@class='desktop-navLink']/descendant::ul[@class='desktop-navBlock']/li"));
			for(WebElement sbitem: submenu) {
					 System.out.println(sbitem.getText()); 
					 Thread.sleep(10000);
					 }

		}
		
		 

	}
}
//a[contains(.,'Men')]/parent::div[@class='desktop-navLink']/descendant::div[@class='desktop-paneContent']/descendant::li
//a[contains(.,'Men')]/parent::div[@class='desktop-navLink']/descendant::ul[@class='desktop-navBlock']/li
//a[contains(.,'"+name+"')]/parent::div[@class='desktop-navLink']/descendant::div[@class='desktop-paneContent']/descendant::li
