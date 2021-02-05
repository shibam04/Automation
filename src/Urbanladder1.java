import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class Urbanladder1 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		  b.get("https://www.urbanladder.com/");
		  Thread.sleep(10000);
		  b.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		  List<WebElement> sale=  b.findElements(By.xpath("//ul[@class='topnav bodytext']/li"));
		  Actions a=new Actions(b);
		  Thread.sleep(1000);
		
		  for(WebElement menuName:sale)
			 {
				 String menu=menuName.getText();
			
				 System.err.println(menu);
				 a.moveToElement(menuName).perform();
				 Thread.sleep(2000);
				 Screenshot1 .ScreenShot(b, menu);
				 List<WebElement> submenu= b.findElements(By.xpath("//span[contains(.,'"+menu+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
				 for(WebElement e:submenu)
				 {
					 System.out.println(e.getText());
				 }
				 Thread.sleep(2000);
}
}
}
