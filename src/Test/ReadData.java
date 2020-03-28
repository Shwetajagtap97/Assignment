package Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadData {

	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream fis= new FileInputStream("./Data/data.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sh=wb.getSheet("Sheet1");
		Row FRow =sh.getRow(0);
		int rcount=sh.getPhysicalNumberOfRows();
		int colcount=FRow.getLastCellNum();
		for(int i=0;i<rcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				Cell c=sh.getRow(i).getCell(j);
				System.out.print(c+"\t");
			}
			System.out.println();
		}
		
	}

}
