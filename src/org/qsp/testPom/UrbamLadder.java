package org.qsp.testPom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.UrbamTest;

public class UrbamLadder 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://www.urbanladder.com/");
		 b.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 UrbamTest sh=new  UrbamTest(b);
		 sh.closeClick();
		 sh.Living(b);
		 sh.sofa();
}
}
