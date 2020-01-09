package Test;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class SaveScreenShot {

	
	public static void screenShot(WebDriver driver, String name) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File SaveScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File FileSS=new File(".\\ScreenShot\\"+name+".png");
		//File FileSS = new File(path);
		Files.copy(SaveScreenshot, FileSS);
		
	}

}
