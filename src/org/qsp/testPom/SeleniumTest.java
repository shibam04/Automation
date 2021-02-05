package org.qsp.testPom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.qsp.pom.SeleniumHome;

public class SeleniumTest 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://www.selenium.dev/");
		 SeleniumHome sh=new  SeleniumHome(b);
		 Thread.sleep(4000);
		 sh.sendText("Java");
		 b.navigate().back();
		 sh.sendText("Testng");
		 Thread.sleep(2000);
		 b.close();
}
}
