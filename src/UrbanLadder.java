import java.io.IOException;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UrbanLadder {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		driver.get("https://www.urbanladder.com/");
		System.out.println("Urbanladder");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		WebElement s = driver.findElement(By.xpath("//li/span[contains(.,'Sale')]"));
		System.out.println(s.getText());

		System.out.println("\nMenu Bar");
		List<WebElement> menu = driver.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		Actions a = new Actions(driver);
		for (WebElement item : menu) {
			System.out.println(item.getText());
			String name = item.getText();
			a.moveToElement(item).build().perform();
			Thread.sleep(10000);
			SaveScreenShot.screenShot(driver, name);
			List<WebElement> submenu = driver.findElements(
					By.xpath("//span[contains(.,'" + name + "')]/parent::li/descendant::ul[@class='taxonslist']"));
			for (WebElement it : submenu) {
				System.out.print(item.getText());
				
			}
		}

	}
}
