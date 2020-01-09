import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyText {

	public static void main(String[] args) throws InterruptedException,AWTException{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Launching Google");
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(10000);
		driver.findElement(By.name("btnK")).sendKeys("btnK",Keys.ENTER);
		Thread.sleep(10000);
		String t1=driver.getTitle();
		WebElement txt=driver.findElement(By.xpath("//span[contains(.,'Java')]/parent::div[@class='kno-ecr-pt PZPZlf gsmt']"));
		System.out.println(txt.getText());
		Actions a=new Actions(driver);
		a.doubleClick(txt).perform();
		Thread.sleep(1000);
		Robot r=new Robot ();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		//Copy selected content
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//open new tab
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(1000);
		//paste the content
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		//search for content
		String t2=driver.getTitle();
		if(t1.equals(t2))
		{
			System.out.println("Successfully Done");
		}
		else
			System.out.println("not Done");
	}

}
