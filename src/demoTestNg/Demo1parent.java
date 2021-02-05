package demoTestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Demo1parent 
{
	WebDriver b;
	@BeforeMethod
	public void beforem() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	    b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	@AfterMethod
	public void afterm() throws InterruptedException
	{
		b.close();
	}
}
