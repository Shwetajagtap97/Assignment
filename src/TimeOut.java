import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TimeOut {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		driver.manage().window().maximize();
		WebDriverWait ww=new WebDriverWait(driver,60);
		driver.get("https://www.google.com/");
		System.out.println("Launching Gmail");
		driver.findElement(By.name("q")).sendKeys("Java",Keys.ENTER);;
		ww.until(ExpectedConditions.titleContains("Java"));
		
		System.out.println(driver.getTitle());

	}

}
