import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.get("https://selenium.dev/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy(0,1000)");//for y index
			Thread.sleep(1000);
			js.executeScript("window.scrollBy(0,-1000)");
			Thread.sleep(1000);
			js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
			Thread.sleep(1000);
			js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");
			//js.executeScript("window.scrollBy(500,0)");
			Thread.sleep(1000);
			WebElement ele=driver.findElement(By.xpath("//h2[text()='News']"));
			js.executeScript("arguments[0].scrollIntoView()", ele);
			
	
		}

}
