import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Google02 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		  b.get("https://www.google.com/");
		  Thread.sleep(2000);
		 // WebElement search=b.findElement(By.name("q"));
		  WebElement search=b.findElement(By.xpath("//input[@aria-label='Search']"));
		  search.sendKeys("java",Keys.ENTER);
		  Thread.sleep(2000);
		  List<WebElement> next= b.findElements(By.xpath("//td[@class='d6cvqb']/following::td"));
		  Actions a=new Actions(b);
		  for(WebElement t:next)
		  {
			 a.click(t).perform();
			 Thread.sleep(5000);
		  }
		 
	   }
	   }

