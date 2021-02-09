import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel 
{
   public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
   {
	  FileInputStream fi=new FileInputStream("C:\\Users\\shiba\\OneDrive\\Desktop\\java\\Book1.xlsx");
	  Workbook s=WorkbookFactory.create(fi);
	  Sheet sh=s.getSheet("Test");
	  int rowcount=sh.getPhysicalNumberOfRows();
	  Row firstRow=sh.getRow(0);
	  for(int row=0;row<rowcount;row++)
	  {
		  for(int col=0;col<firstRow.getLastCellNum();col++)
		  {
			  Cell cl=sh.getRow(row).getCell(col);
			  System.out.print(cl);
			  
		  }
		  System.out.println();
	  }
	  
}
}
