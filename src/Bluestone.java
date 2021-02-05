import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bluestone 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/jewellery.html");
		WebElement search=b.findElement(By.xpath("//input[@type='text' and @id='search_query_top_elastic_search']"));
	    search.sendKeys("diamond ring",Keys.ENTER);
	    Thread.sleep(2000);
	    b.findElement(By.xpath("//img[@alt='The Florian Rose Ring']")).click();
	    Thread.sleep(2000);
	    System.out.println("Before switching tabs:"+b.getTitle());
        Set<String> wins=b.getWindowHandles();	
		for(String win:wins)
		{
			b.switchTo().window(win);
		}
		System.out.println("After switching tabs:"+b.getTitle());
		WebElement s=b.findElement(By.xpath("//input[@name='Submit']/parent::div[@class='buynow-block col-xs-7']"));
		s.click();
		WebElement s1=b.findElement(By.xpath("//div[@class='formErrorContent']"));
		System.out.println("Error Message:"+s1.getText());
		
     }
}

