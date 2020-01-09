package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import junit.framework.Assert;

public class Scenario14 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,70);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//div[@class='gms-banner-inner']")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shwetajagtap@gmail.com");
		driver.findElement(By.xpath("//input[@id='gmsStart']")).click();
		WebElement em=driver.findElement(By.xpath("//input[@id='email']"));
		WebElement amt=driver.findElement(By.xpath("//span[@class='WebRupee']"));
		String amount=amt.getText();
		Assert.assertEquals("Price Validate", amount , amt.getText());
		Assert.assertEquals("Email Validate", "shwetajagtap@gmail.com", em.getAttribute("value"));
		System.out.println("Successfully done");
		
	}

}
