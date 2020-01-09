import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args)throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		System.out.println("Launching Facebook");
		Thread.sleep(10000);
		WebElement email=driver.findElement(By.id("email"));
		Actions a=new Actions(driver);
		a.contextClick(email).perform();
		Thread.sleep(1000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(500,0)");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(-500,0)");
		Thread.sleep(1000);
		js.executeScript("window.scrollTo(document.body.scrollWidth,0)");
		Thread.sleep(100);
		System.out.println("Launching Facebook");
		js.executeScript("window.scrollTo(-document.body.scrollWidth,0)");
		System.out.println("Launching Facebook");
		email.sendKeys("shwetajagtap99@gmail.com");
		Thread.sleep(10000);
		driver.findElement(By.id("pass")).sendKeys("1235");
		driver.findElement(By.id("loginbutton")).click();
		//driver.quit();
		

	}

}
