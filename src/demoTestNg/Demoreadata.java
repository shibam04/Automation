package demoTestNg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demoreadata 
{
	@DataProvider
	public static String[][] demo() throws Exception
	{
		String[][] arr;
		FileInputStream fi=new FileInputStream("C:\\Users\\shiba\\OneDrive\\Desktop\\java\\Book1.xlsx");
		Workbook s=WorkbookFactory.create(fi);
		Sheet sh=s.getSheet("Sheet1");
		int rowcount=sh.getPhysicalNumberOfRows();
		Row firstRow=sh.getRow(0);
		arr=new String[rowcount-1][firstRow.getLastCellNum()];
		for(int row=1;row<rowcount;row++)
		{
			for(int col=0;col<firstRow.getLastCellNum();col++)
			{
				arr[row-1][col]=sh.getRow(row).getCell(col).toString();

			}
		}
		return arr;
	}
	@Test(dataProvider="demo")
	public void tc1(String user,String pass)
	{
		Reporter.log(user+" "+pass,true);
	}

}

