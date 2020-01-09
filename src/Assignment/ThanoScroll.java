package Assignment;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import Test.SaveScreenShot;

public class ThanoScroll {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.MINUTES);
		driver.get("https://www.google.com/");
		System.out.println("URL LOAD");
		WebElement search=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		search.sendKeys("thanos",Keys.ENTER);
		WebElement res=driver.findElement(By.xpath("//div[@id='resultStats']"));
		System.out.println(res.getText());
		WebElement tosrol=driver.findElement(By.xpath("//div[@class='e2BEnf U7izfe']/h3[text()='Top stories']"));
		WebElement hand=driver.findElement(By.xpath("//div[@class='Z4Kand MyFLjb']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView()",tosrol);
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "hand");
		hand.click();
		Thread.sleep(100000);
		WebElement res2=driver.findElement(By.xpath("//div[@id='resultStats']"));
		System.out.println(res2.getText());

	}

}
