package Excel_Sheet;

import java.io.FileInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class example1_getStringData 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException
	{
		
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Study\\26 Mar Eve.xlsx");
//		String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
//		System.out.println(value);
		
		
		Workbook book = WorkbookFactory.create(file);		
		Sheet sh = book.getSheet("Sheet1");
		Row rw = sh.getRow(0);
		Cell cl = rw.getCell(2);
		double value = cl.getNumericCellValue();
		System.out.println(value);		
	}

}

