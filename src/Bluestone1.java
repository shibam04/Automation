import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/jewellery.html");
		System.out.println(b.getTitle());
		WebElement q=b.findElement(By.xpath("//a[contains(@title,'Jewellery')]/parent::li[@class='menuparent']"));
		Actions s=new Actions(b);
		s.moveToElement(q).perform();
		Thread.sleep(1000);
		b.findElement(By.xpath("//span[contains(text(),'Kadas')]")).click();
		b.findElement(By.xpath("//img[@class='hc img-responsive center-block' and @alt='The Udith Kada For Him']")).click();
		Set<String> winshandel=b.getWindowHandles();
		for(String win:winshandel)
		{

			b.switchTo().window(win);

		}
		System.out.println(b.getTitle());
		b.findElement(By.xpath("//span[@class='icon-ion-android-arrow-dropdown']")).click();
		Thread.sleep(3000);
		b.findElement(By.xpath("//ul[@class='bangleSize']/li[2]")).click();
		b.findElement(By.xpath("//input[@type='submit' and @id='buy-now']")).click();
		WebElement f=b.findElement(By.xpath("//a[contains(.,'The Udith Kada For Him')]"));
		System.out.println("Title:"+f.getText());
	}
}
