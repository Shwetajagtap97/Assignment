import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.google.common.io.Files;

public class TakeScreenShotAndSave {
	public static void screenShot(WebDriver driver, String path) throws IOException{
		TakesScreenshot ts = (TakesScreenshot) driver;
		File SaveScreenshot = ts.getScreenshotAs(OutputType.FILE);
		File ff= new File(path);
		Files.copy(SaveScreenshot, ff);
	}

}
