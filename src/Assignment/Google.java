package Assignment;

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
		Thread.sleep(10000);
		driver.get("https://www.google.com/");
		System.out.println("Launching Google");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(100000);
		WebElement list=driver.findElement(By.xpath("//li[position()=3]"));
		Actions a=new Actions(driver);
		a.moveToElement(list).perform();
		System.out.println("Serach for:"+list.getText());
		Thread.sleep(10000);
		list.click();
		
		
		
		

	}

}
