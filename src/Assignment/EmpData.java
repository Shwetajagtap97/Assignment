package Assignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class EmpData {
	@Test
	public void EmpData() throws EncryptedDocumentException, InvalidFormatException, FileNotFoundException, IOException
	{	int count=-1;
		Workbook wb=WorkbookFactory.create(new FileInputStream("./Data/emp.xlsx"));
		String str="salary";
		int rc=wb.getSheet("Sheet1").getPhysicalNumberOfRows();
		int cc=wb.getSheet("Sheet1").getRow(0).getLastCellNum();
		for(int i=0;i<cc;i++)
		{	String c=wb.getSheet("Sheet1").getRow(0).getCell(i).toString();
			if(c.equalsIgnoreCase(str))
			{
				count=i;
			}
		}
		for(int i=0;i<rc;i++)
		{	 String data=wb.getSheet("Sheet1").getRow(i).getCell(count).toString();
			Reporter.log(data,true);
		}
		
	}
}
