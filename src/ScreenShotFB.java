import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShotFB {

	public static void main(String[] args) throws IOException  {
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		System.out.println("Lauching browser");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		System.out.println("Launching Facebook");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File SaveScreenshot=ts.getScreenshotAs(OutputType.FILE);
		File FileSS=new File(".\\ScreenShot\\facebook.png");
		Files.copy(SaveScreenshot, FileSS);
		//String str=".\\ScreenShot\\fb.png";
		
	}

}
