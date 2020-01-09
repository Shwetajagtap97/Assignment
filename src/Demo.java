		import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.lang.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(10000);
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("https://www.amazon.com/");
		driver.get("https://www.gmail.com/");
		driver.get("https://www.google.com/");
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.facebook.com/");
		driver.get("https://www.naukri.com/");
		driver.close();
		
	}

}
