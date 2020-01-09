package Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iqgenie {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(70, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,70);
		driver.get("https://iqgenie.org/");
		System.out.println("URL load");
		driver.findElement(By.xpath("//i[@id='userIcon']")).click();
		driver.findElement(By.xpath("//a[@class='hollow button alert']")).click();
		Set<String> wins=driver.getWindowHandles();
		for(String win:wins)
		{
			driver.switchTo().window(win);			
		}
		ww.until(ExpectedConditions.titleContains("Google"));
		System.out.println(driver.getTitle());
		
	}

}
