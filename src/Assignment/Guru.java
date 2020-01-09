package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");//chromee driver and its path
		WebDriver driver = new ChromeDriver();//object creatation of chromeDriver with Webdriver class
		System.out.println("Lauching browser");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/v1/index.php");
		driver.findElement(By.name("btnLogin")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(10000);
		a.accept();
	}

}
