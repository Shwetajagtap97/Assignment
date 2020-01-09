import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitime {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");//chromee driver and its path
		WebDriver driver = new ChromeDriver();//object creatation of chromeDriver with Webdriver class
		System.out.println("Lauching browser");
		Thread.sleep(1000);//stop 
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("Launching Actitime");
		Thread.sleep(20000);
		String login=driver.getTitle();
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String home=driver.getTitle();
		if(login.equals(home))
			System.out.println("Login not done");
		else
		{
			System.out.println("Login Done Successfully");
			driver.findElement(By.id("logoutLink")).click();
			Thread.sleep(1000);
		}
		
		String logout=driver.getTitle();
		if(login.equals(logout))
			System.out.println("Logout Sucessfully");
		System.out.println(driver.findElement(By.xpath("//input[@name='username']/parent::td/parent::tr/following::td")).getText()+"Done");
		System.out.println(driver.findElement(By.xpath("//input[@name='username']/ancestor::tr/following::td")).getText());
		driver.close();

	}

}
