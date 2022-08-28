package Excel_Sheet;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Ex2_getRowSize {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream file=new FileInputStream("C:\\Users\\Admin\\Desktop\\Study\\26 Mar Eve.xlsx");
		
		int rowSize = WorkbookFactory.create(file).getSheet("Sheet1").getLastRowNum()+1;  //[method getLastRowNum will give us output as row last index no]
		
		System.out.println(rowSize);
	
		

	}

}
