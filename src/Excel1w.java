import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel1w 
{
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
	{
		FileInputStream fi=new FileInputStream("C:\\Users\\shiba\\OneDrive\\Desktop\\java\\Write.xlsx");
		Workbook s=WorkbookFactory.create(fi);
		Sheet sh1=s.createSheet("Validlogin");
		sh1.createRow(0).createCell(0).setCellValue("Admin");
		Sheet sh=s.getSheet("Sheet1");
		Cell cl=sh.createRow(0).createCell(0);
		cl.setCellValue("Username");
		sh.getRow(0).createCell(0).setCellValue("Password");
		FileOutputStream fio=new FileOutputStream("C:\\Users\\shiba\\OneDrive\\Desktop\\java\\Write.xlsx");
		s.write(fio);
		System.out.println("Done");
		s.close();


	}
}
