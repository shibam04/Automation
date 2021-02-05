import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		b.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		List<WebElement> menus=b.findElements(By.xpath("//div[@class='_1kidPb']/span"));
		Actions a=new Actions(b);
		Thread.sleep(1000);
		for(WebElement m:menus)
		{

			String menu=m.getText();	
			System.err.println(menu);
			a.moveToElement(m).perform();
			Thread.sleep(2000);
			List<WebElement> submenu= b.findElements(By.xpath("//span[contains(.,'"+menu+"')]/following::div[@class=\"_1fwVde\"]/a"));
			for(WebElement e:submenu)
			{
				System.out.println(e.getText());
			}
			Thread.sleep(2000);
		}
		List<WebElement> menu=b.findElements(By.xpath("//div[@class='_1kidPb']/descendant::a"));
		for(WebElement x:menu)
		{
			String menus1=x.getText();	
			System.err.println(menus1);
			a.moveToElement(x).perform();
		}

	}
}
