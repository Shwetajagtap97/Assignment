import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com/");
		System.out.println("Launching Amazon");
		Thread.sleep(10000);
		List<WebElement> menu=driver.findElements(By.xpath("//div[@id='nav-xshop-container']"));
		for(WebElement item: menu)
		{
			System.out.println(item.getText());
		}
		System.out.println("All Iteam:");
		System.out.println(driver.findElement(By.xpath("//select[contains(.,'All')]")).getText());		
	}

}
