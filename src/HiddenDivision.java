import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDivision 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://demo.actitime.com/login.do");
		 b.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 WebElement s=b.findElement(By.xpath("//b[contains(.,'admin')]"));
		 WebElement s1=b.findElement(By.xpath("//b[contains(.,'manager')]"));
		 WebElement s2=b.findElement(By.xpath("//input[contains(@name,'username')]"));
		 WebElement s3=b.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		 s2.sendKeys(s.getText());
		 s3.sendKeys(s1.getText());
		 WebElement s4=b.findElement(By.xpath("//a[@id='loginButton']"));
		 s4.click();
		 b.findElement(By.xpath("//div[@class='menuTable']/div[4]")).click();
		 b.findElement(By.xpath("//a[@onclick='MenuHandler.openAbout(); return false;']")).click();
		WebElement d= b.findElement(By.xpath("//span[contains(text(),'© 2021 actiTIME Inc. All rights reserved.')]"));
		System.out.println(d.getText());
		 
}
}
