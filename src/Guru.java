import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Guru {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/upload/");
		driver.findElement(By.xpath("//input[@class='upload_txt']")).click();
		Runtime rt = Runtime.getRuntime();
		Thread.sleep(2000);
		
		Runtime.getRuntime().exec("‪C:\\Users\\Lenovo\\workspace\\Selenium\\src\\Testguru.exe‪‪‪‪");
	}

}
