import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScrollGoogle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("python",Keys.ENTER);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebDriverWait ww=new WebDriverWait(driver,70);
		do
		{
		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//a[@class='pn']/span[text()='Next']")).click();
		Thread.sleep(1000);
		}while(ww.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@class='pn']/span[text()='Next']"))) != null);		
	}

}
