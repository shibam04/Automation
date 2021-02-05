import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp02 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://demo.actitime.com/login.do");
	    Thread.sleep(2000);
	    b.findElement(By.partialLinkText("Inc.")).click();
		Set<String> wins=b.getWindowHandles();
		

		for(String win:wins)
		{
	
			b.switchTo().window(win);
	
		}
		System.out.println(b.getTitle());
		
	}
}
