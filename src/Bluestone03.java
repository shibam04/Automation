import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Bluestone03 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/jewellery.html");
		List<WebElement> menu=b.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a=new Actions(b);
		String parent=b.getWindowHandle();
		System.out.println("PARENT:"+parent);
		for(WebElement x:menu)
		{
			Thread.sleep(3000);
			if(x.getText().equals("COINS"))
			{
				WebElement s=b.findElement(By.xpath("//a[@title='Coins']"));
				a.moveToElement(s).perform();
				List<WebElement> submenu=b.findElements(By.xpath("//span[@data-p='gold-coins-weight-1gms,m']/parent::li/parent::ul/descendant::li"));
				for(WebElement l:submenu)
				{
					Thread.sleep(2000);
					if(l.getText().equals("10 gram"))
					{
						
						b.findElement(By.xpath("//a[contains(text(),'10 gram')]")).click();
						break;
					}
					
					else
					{
						a.moveToElement(l).perform();
					}
				}
				break;
			}
			else
			{
				a.moveToElement(x).perform();
			}
		}	
		b.close();
	}
}


