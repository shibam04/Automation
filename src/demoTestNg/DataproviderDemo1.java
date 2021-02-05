package demoTestNg;

import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataproviderDemo1 
{
   @DataProvider
   public static String[][] demo()
   {
	   String[][] arr=new String[3][2];
	   arr[0][0]="User A";
	   arr[0][1]="A";
	   arr[1][0]="User B";
	   arr[1][1]="B";
	   arr[2][0]="User C";
	   arr[2][1]="C";
	   return arr;
   }
   @Test(dataProvider="demo")
   public void tc1(String user,String pass)
   {
	   Reporter.log(user+" "+pass,true);
   }
}
