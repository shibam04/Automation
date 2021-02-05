import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Demoactitime 
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
			WebElement v= b.findElement(By.xpath("//a[@id='logoutLink']"));
			 WebDriverWait w=new  WebDriverWait(b,10);
			 w.until(ExpectedConditions.elementToBeClickable(v));
			v.click();
}
}
