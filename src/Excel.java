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
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Excel 
{
   public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException 
   {
	  FileInputStream fi=new FileInputStream("C:\\Users\\shiba\\OneDrive\\Desktop\\java\\Book1.xlsx");
	  Workbook s=WorkbookFactory.create(fi);
	  Sheet sh=s.getSheet("Sheet1");
	  int rowcount=sh.getPhysicalNumberOfRows();
	  Row firstRow=sh.getRow(0);
	  /*for(int row=0;row<rowcount;row++)
	  {
		  for(int col=0;col<firstRow.getLastCellNum();col++)
		  {
			  Cell cl=sh.getRow(row).getCell(col);
			  System.out.println(cl);
			  
		  }
	  }*/
	   for(int row=0;row<rowcount;row++)
	  {
		  for(int col=0;col<firstRow.getLastCellNum();col++)
		  {
			  Cell cl=sh.getRow(row).getCell(col);
			  System.out.print(cl.toString() +" ");
			  
		  }
		  System.out.println();
	  }
	 /*  for(int row=0;row<rowcount;row++)
		  {
			  for(int col=0;col<firstRow.getLastCellNum();col++)
			  {
				 System.out.print(sh.getRow(row));
				  
			  }
			  System.out.println();
		  }
		  
	   System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://demo.actitime.com/login.do");
		 b.findElement(By.xpath("//input[@name='username']")).sendKeys("c1");
		 b.findElement(By.xpath("//input[@name='pwd']"));*/
	  
	  
	  
}
}
