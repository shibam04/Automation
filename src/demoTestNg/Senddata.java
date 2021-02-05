package demoTestNg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Senddata 
{
	@Test(dataProvider="demo",dataProviderClass=demoTestNg.Demoreadata.class)
	public void tc1(String user,String pass)
	{
		Reporter.log(user+" "+pass,true);
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");	
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		b.get("https://demo.actitime.com/login.do");
		b.findElement(By.xpath("//input[contains(@name,'username')]")).sendKeys(user);
		b.findElement(By.xpath("//input[contains(@name,'pwd')]")).sendKeys(pass,Keys.ENTER);
		WebDriverWait w=new WebDriverWait(b,10);
		w.until(ExpectedConditions.titleContains("Enter"));
	}
}
