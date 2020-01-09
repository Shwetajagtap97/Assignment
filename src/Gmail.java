import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
		System.out.println("Launching Gmail");
		//Thread.sleep(10000);
		WebElement email=driver.findElement(By.id("identifierId"));
		email.sendKeys("shwetajagtap99@gmail.com");
		//Thread.sleep(10000);
		//driver.findElement(By.id("pass")).sendKeys("1235");
		driver.findElement(By.id("identifierNext")).click();
		//Thread.sleep(10000);
		driver.findElement(By.name("password")).sendKeys("123456978");
		driver.findElement(By.id("passwordNext")).click();
		//driver.quit();
		

	}

}
