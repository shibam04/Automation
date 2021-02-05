import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		  b.get("https://www.google.com/");
		  Thread.sleep(2000);
		  System.out.println(b.findElement(By.tagName("title")).getAttribute("textContent"));
		  WebElement search=b.findElement(By.xpath("//input[@aria-label='Search']"));
		  search.sendKeys("java",Keys.ENTER);
		  Thread.sleep(5000);
		 /* List<WebElement> x= b.findElements(By.xpath("//div[@class=\"sbl1\"]"));
		  for(WebElement menus:x)
			{
				System.out.println(menus.getText());
			}
		  x.get(2).click();*/
		  
		  List<WebElement> list= b.findElements(By.tagName("a"));
		  System.out.println(list.size());
		  for(WebElement links:list)
			{
				System.out.println(links.getText());
			}
		  
}
}
