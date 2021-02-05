
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Urbanladder01 
{
	public static void main(String[] args) throws InterruptedException 
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
			 List<WebElement> submenu= b.findElements(By.xpath("//span[contains(.,'"+menu+"')]/parent::li/descendant::ul[@class='taxonslist']/li"));
			 for(WebElement e:submenu)
			 {
				 System.out.println(e.getText());
			 }
			 Thread.sleep(2000);
		 }
		// Iterator<WebElement> i=sale.iterator();
		/* while(i.hasNext())
		 {
			 WebElement e= i.next();
			 System.out.println(e.getText());
			
		 }*/
		 
	   }
}
