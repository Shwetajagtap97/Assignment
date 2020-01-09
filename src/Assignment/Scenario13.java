package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,70);
		driver.get("https://www.bluestone.com/");
		driver.findElement(By.xpath("//div[@class='gms-banner-inner']")).click();
		driver.findElement(By.xpath("//input[@id='amount']")).sendKeys("10000");
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("shwetajagtap@gmail.com");
		WebElement amt=driver.findElement(By.xpath("//label[text()='Enter Monthly Amount']"));
		WebElement em=driver.findElement(By.xpath("//label[text()='Enter Email address']"));
		if(amt.getText().equals("Enter Monthly Amount") && em.getText().equals("Enter Email address"))
		{
			System.out.println("Successfully done");
		}
		driver.findElement(By.xpath("//input[@id='gmsStart']")).click();
	}

}
