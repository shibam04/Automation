import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alert01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
			 WebDriver b=new ChromeDriver();
			 b.manage().window().maximize();
			 b.get("https://demoqa.com/alerts");
			 b.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			/* b.findElement(By.id("confirmButton")).click();
			 Alert a=b.switchTo().alert();
			 System.out.println(a.getText());
			a.dismiss();*/
		   /* b.findElement(By.id("promtButton")).click();
			
		
			 Alert a=b.switchTo().alert();
			 Thread.sleep(3000);
			 a.sendKeys("Shibam");
			 System.out.println(a.getText());
			 a.accept();*/
			 b.findElement(By.id("timerAlertButton")).click();
			 WebDriverWait w=new  WebDriverWait(b,10);
			 w.until(ExpectedConditions.alertIsPresent());
			 Alert a=b.switchTo().alert();
			 a.accept();
			 
			 
			 
			 
	}
	
}
