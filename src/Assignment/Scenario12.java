package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario12 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,70);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//div[@class='gms-banner-inner']")).click();
		driver.findElement(By.xpath("//div[@class='form-submit text-center auto-filled']/input")).click();
		WebElement err1=driver.findElement(By.xpath("//div[@class='col-xs-4 fl-wrap error']/ul/li"));
		WebElement err2=driver.findElement(By.xpath("//div[@class='col-xs-5 fl-wrap error']/ul/li"));
		System.out.println(err1.getText());
		System.out.println(err2.getText());
	}

}
