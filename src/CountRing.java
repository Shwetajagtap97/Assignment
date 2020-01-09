import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountRing {

	public static void main(String[] args) throws InterruptedException,AWTException {
		int count=0;
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Launching Browser");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.bluestone.com/");
		System.out.println("Launching Bluestone");
		Thread.sleep(10000);
		WebElement ring=driver.findElement(By.xpath("//a[contains(.,'Ring')]"));
		ring.click();
		System.out.println("click on ring");
		Thread.sleep(10000);
		List<WebElement> img=driver.findElements(By.xpath("//ul[@class='product-grid ']/li"));
		System.out.println("Count:"+img.size());
	}

}
