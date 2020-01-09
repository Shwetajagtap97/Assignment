import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotDemo {

	public static void main(String[] args) throws AWTException{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		//Thread.sleep(1000);
		driver.manage().window().maximize();
		
		Robot r=new Robot ();
		//r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_T);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_CONTROL);
	}

}
