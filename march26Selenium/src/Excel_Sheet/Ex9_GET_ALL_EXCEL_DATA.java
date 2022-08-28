package Excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex9_GET_ALL_EXCEL_DATA {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Study\\26 Mar Eve.xlsx");
		
		Sheet sh = WorkbookFactory.create(file).getSheet("Sheet1");
		
		int lastRowIndex=sh.getLastRowNum();
		
		for(int i=0; i<=lastRowIndex;i++)      //for Row
		{
			String value=sh.getRow(i).getCell(0).getStringCellValue();
			System.out.print(value+"   ");
		
		
		int lastColIndex=sh.getRow(0).getLastCellNum()-1;
		
		for(int j=1;j<=lastColIndex;j++)    //for column
		{
			String value1=sh.getRow(i).getCell(j).getStringCellValue();
			System.out.print(value1+"   ");
		}
		System.out.println();
	}
}

}