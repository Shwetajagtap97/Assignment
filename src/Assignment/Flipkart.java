package Assignment;

import java.awt.RenderingHints.Key;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		WebDriverWait ww=new WebDriverWait(driver,20);
		driver.get("https://www.flipkart.com/");
		System.out.println("Launching Flipkart");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement txt=driver.findElement(By.xpath("//input[@class='LM6RPg']"));
		txt.sendKeys("iphone");
		List<WebElement> sugetion=driver.findElements(By.xpath("//ul[@class='col-12-12 _1PBbw8']/descendant::a"));
		for(WebElement sug:sugetion)
		{	System.out.println(sug);
			System.out.println(sug.getText());
		}
		System.out.println(sugetion.size());
		Actions a=new Actions(driver);
		a.dragAndDropBy(txt, 1, 0).perform();
		//ww.until(ExpectedConditions.titleContains(""));
		//driver.findElement(By.xpath(""));
		
		
	}

}
