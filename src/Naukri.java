import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukri {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");
		System.out.println("Launching Naukri");
		Thread.sleep(10000);
		System.out.println("loading url");
		driver.findElement(By.id("block")).click();
		String parent=driver.getWindowHandle();
		System.out.println("parent:"+parent.toString());
		Set<String> wins=driver.getWindowHandles();
		System.out.println(wins.getClass().toString());
		wins.remove(parent);
		for(String  win : wins){
			System.out.println(win);
			driver.switchTo().window(win);
			System.out.println("Window close");
		}
		ArrayList<String> a1=new ArrayList<>(wins);
		/*for(int i=a1.size()-1;i>=0;i--){
			driver.switchTo().window(a1.get(i)).close();
		}*/
		Thread.sleep(1000);
		}

}
