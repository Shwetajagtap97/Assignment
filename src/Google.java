import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		System.out.println("Launching Google");
		driver.navigate().back();
		Thread.sleep(10000);
		driver.navigate().forward();
		Thread.sleep(10000);
		driver.navigate().refresh();
		Thread.sleep(10000);
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(10000);
		driver.findElement(By.name("btnK")).sendKeys("btnK",Keys.ENTER);
		Thread.sleep(10000);
		WebElement txt=driver.findElement(By.xpath("//span[contains(.,'Java')]/parent::div[@class='kno-ecr-pt PZPZlf gsmt']"));
		System.out.println(txt.getText());
		Actions a=new Actions(driver);
		a.doubleClick(txt).perform();
		
	}

}
