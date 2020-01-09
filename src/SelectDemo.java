
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDemo {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		
		Thread.sleep(1000);
		driver.manage().window().maximize();
		driver.get("file:///G:/Shweta/tybsc/ty031/cgproject/Abc.html");
		WebElement op=driver.findElement(By.id("A"));
		Select s= new Select(op);
		s.selectByValue("456");
		Thread.sleep(1000);
		WebElement op2=driver.findElement(By.xpath("//select[@id='b']"));
		Select s1= new Select(op2);
		List <WebElement> value=s1.getOptions();
		if(s1.isMultiple())
		{	
			for(WebElement vl:value)
			{
				System.out.println(vl.getText());
				s1.selectByValue(vl.getText());
			}
		}
		Thread.sleep(1000);
		System.out.println("------");
		System.out.println(s1.getFirstSelectedOption().getText());
		Thread.sleep(1000);
		System.out.println("------");
	
		List<WebElement> seval=s1.getAllSelectedOptions();
		for(WebElement vl1:seval)
		{
			System.out.println(vl1.getText());
			s1.deselectByValue(vl1.getText());
		}

		
	}

}
