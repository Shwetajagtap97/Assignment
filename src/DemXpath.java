import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemXpath {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Launching Actitime");
		Thread.sleep(0000);
		WebElement user=driver.findElement(By.xpath("//td[@id='headerContainer']"));
		System.out.println(user.getText());
		Thread.sleep(1000);
		driver.findElement(By.id("username")).sendKeys(user.getText());
		driver.findElement(By.name("pwd")).sendKeys(user.getText());
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(10000);
		WebElement msg=driver.findElement(By.xpath("//span[@class='errormsg']"));
		System.out.println(msg.getText());
		Thread.sleep(2000);
	}

}
