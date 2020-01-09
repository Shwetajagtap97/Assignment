import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataExcel {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException {
		FileInputStream fis= new FileInputStream("./Data/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row r=sh.getRow(0);
		int rcount=sh.getPhysicalNumberOfRows();
		int colcount=r.getLastCellNum();
		System.out.println("Row Count:"+rcount+"	Column Count:"+colcount);
		for(int i=0;i<rcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				Cell c=sh.getRow(i).getCell(j);
				System.out.print(c+"\t");
			}
			System.out.println();
		}
		String user=sh.getRow(1).getCell(0).toString();
		String pwd=sh.getRow(1).getCell(1).toString();
		System.out.println(user+"\t"+pwd);
		System.setProperty("webdriver.chrome.driver", ".\\Softwares\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys(user);
		driver.findElement(By.id("pass")).sendKeys(pwd);
		Thread.sleep(1000);
		SaveScreenShot.screenShot(driver, "readdata");
		driver.findElement(By.id("loginbutton")).click();
		driver.get("https://www.gmail.com/");
		driver.findElement(By.id("identifierId")).sendKeys(user);
		driver.findElement(By.id("identifierNext")).click();
		//driver.findElement(By.name("password")).sendKeys(pwd);
		//driver.findElement(By.id("passwordNext")).click();
	}

}
