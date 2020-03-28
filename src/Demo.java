		import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import java.lang.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Demo {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", ".\\Softwares\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		System.out.println("Lauching browser");
		Thread.sleep(10000);
		System.out.println(driver.manage().toString());
		System.out.println(driver.manage().window().toString());
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//driver.get("https://www.amazon.com/");
		//driver.get("https://www.gmail.com/");
		driver.get("https://www.google.com/");
		//driver.get("https://www.flipkart.com/");
		//driver.get("https://www.facebook.com/");
		//driver.get("https://www.naukri.com/");
		driver.close();
		
	}

}
