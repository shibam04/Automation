import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Automationprac 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("http://automationpractice.com/index.php");
		List<WebElement> a=b.findElements(By.xpath("//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li"));
		Actions c=new Actions(b);
		for(WebElement x:a)
		{
			System.out.println(x.getText());
			c.moveToElement(x).perform();
			Thread.sleep(2000);
		}
		
		
	}
}
