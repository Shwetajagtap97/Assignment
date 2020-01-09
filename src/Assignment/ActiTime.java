package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");//chromee driver and its path
		WebDriver driver = new ChromeDriver();//object creatation of chromeDriver with Webdriver class
		System.out.println("Lauching browser");
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Launching Actitime");
		String login=driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("Login on Actitime");
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support']/div")).click();
		System.out.println("click on ?");
		driver.findElement(By.xpath("//a[text()='About your actiTIME']")).click();
		System.out.println("Click on Actitime");
		WebElement txt=driver.findElement(By.xpath("//td[@class='aboutCopyright']"));
		System.out.println(txt.getText());
		
		

	}

}
