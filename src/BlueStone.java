import java.io.IOException;
import java.util.*;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BlueStone {

	public static void main(String[] args)throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Launching Browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("https://www.bluestone.com/");
		System.out.println("Launching Bluestone");
		List<WebElement> menu=driver.findElements(By.xpath("//div[@class='bottom-header']/descendant::ul[@class='wh-main-menu']/li"));
		Actions a= new Actions(driver);
		for(WebElement item: menu)
		{
			System.out.println(item.getText());
			String name=item.getText();
			a.moveToElement(item).build().perform();
			Thread.sleep(1000);
			SaveScreenShot.screenShot(driver, name);
			List<WebElement> sbmenu=driver.findElements(By.xpath("//a[contains(.,'"+name+"')]/parent::li[@class='menuparent repb']/descendant::div[@class='col-inner']/ul[@class='two-col']/li"));
			for(WebElement sditem: sbmenu)
			{
				System.out.println(item.getText());
			}
		}
		String parent=driver.getWindowHandle();
		WebElement jlr=driver.findElement(By.xpath("//a[contains(.,'All Jewellery ')]"));
		a.moveToElement(jlr).perform();
		Thread.sleep(1000);
		System.out.println("On All j");
		SaveScreenShot.screenShot(driver, "All Jewellery2");
		driver.findElement(By.xpath("//a[contains(.,'Kada')]")).click();
		Thread.sleep(1000);
		System.out.println("On kada");
		driver.findElement(By.xpath("//a[@id='pid_8967']/img[@class='hc img-responsive center-block']")).click();
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "Kada");
		Set<String> win=driver.getWindowHandles();
		for(String child: win)
		{
			driver.switchTo().window(child);
		}
		driver.findElement(By.xpath("//input[@id='buy-now']")).click();
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "buy-now");
		WebElement err=driver.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println(err.getText());
		SaveScreenShot.screenShot(driver, "Error");
		driver.switchTo().window(parent);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[contains(.,'Ring')]")).click();
		Thread.sleep(1000);
		System.out.println("On ring");
		SaveScreenShot.screenShot(driver, "Ring2");
		WebElement pric=driver.findElement(By.xpath("//section[@class='block']/span[@class='title style-fill i-right']/span[contains(.,'Price')]"));
		a.moveToElement(pric).perform();
		Thread.sleep(1000);
		System.out.println("On p");
		SaveScreenShot.screenShot(driver, "Price");
		List<WebElement> cont=driver.findElements(By.xpath("//form[@id='price']/div/div[@class='form-item ']/span"));
		for(WebElement val:cont){
			System.out.println(val.getText());
		}
		
		System.out.println("Done");

		
	}

}
