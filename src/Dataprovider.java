import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider {
	@DataProvider
	public String[][] getData()
	{
		String[][] str=new String[4][2];
		str[0][0]="Usaer A";
		str[0][1]="123";
		
		str[1][0]="Usaer B";
		str[1][1]="456";
		
		str[2][0]="Usaer C";
		str[2][1]="789";
		
		str[3][0]="Usaer d";
		str[3][1]="012";
		return str;
	}
	@Test(dataProvider="getData")
	public void createUser(String user,String pwd){
		Reporter.log(user+":"+pwd, true);
	//	System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/");
		//driver.findElement(By.id("email")).sendKeys(user);
//		driver.findElement(By.id("pass")).sendKeys(pwd);
//		driver.findElement(By.id("loginbutton")).click();
//		driver.close();
	}
}
