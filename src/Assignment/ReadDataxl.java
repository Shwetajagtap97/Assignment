/**
 * 
 */
package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;

/**
 * @author Lenovo
 *
 */
public class ReadDataxl {
	@DataProvider
	public String[][] readData() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{
		
		Workbook wb=WorkbookFactory.create(new FileInputStream("./Data/data.xlsx"));
		Sheet sh=wb.getSheet("Sheet1");
		String[][] str=new String[sh.getPhysicalNumberOfRows()-1][sh.getRow(0).getLastCellNum()];
		for(int i=1;i<sh.getPhysicalNumberOfRows();i++)
			for(int j=0;j<sh.getRow(0).getLastCellNum();j++)
			{
				Cell c=sh.getRow(i).getCell(j);
				str[i-1][j]=c.toString();
				Reporter.log(str[i-1][j], true);
			}
		return str;
		
	}
}
