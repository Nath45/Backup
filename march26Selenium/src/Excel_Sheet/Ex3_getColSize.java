package Excel_Sheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex3_getColSize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Study\\26 Mar Eve.xlsx");
		
		short colSize = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getLastCellNum();
		
		System.out.println(colSize);
		
		

	}

}
