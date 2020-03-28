package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Launching Browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		System.out.println("Launching Google");
		driver.findElement(By.name("q")).sendKeys("java");
		//read.sleep(100000);
		WebElement list=driver.findElement(By.xpath("//li[3]"));
		Actions a=new Actions(driver);
		a.moveToElement(list).perform();
		System.out.println("Serach for:"+list.getText());
		//read.sleep(10000);
		list.click();
		driver.close();
	}

}
