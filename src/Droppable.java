import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		System.out.println("Launching Browser");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.get("https://www.jqueryui.com/droppable/");
		System.out.println("Launching JQuery");
		Thread.sleep(10000);
		WebElement frame=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(frame);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions a= new Actions(driver);
		a.dragAndDrop(drag, drop).perform();
		Thread.sleep(10000);
		WebElement txt=driver.findElement(By.xpath("//div[@class='ui-widget-header ui-droppable ui-state-highlight']"));
		System.out.println(txt.getText());
	}

}
