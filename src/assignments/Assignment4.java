package assignments;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment4
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/jewellery.html");
		WebElement p=b.findElement(By.xpath("//a[@title='Coins']"));
		Actions o=new Actions(b);
		o.moveToElement(p).perform();
		Thread.sleep(4000);
		b.findElement(By.xpath("//span[@data-p='l-gold-coins-weight-5gms,m']")).click();
		WebElement gold=b.findElement(By.xpath("//h1[text()='5 gram 24 KT Lakshmi Gold Coin']"));
		if(gold.isDisplayed())
		{
			System.out.println(gold.getAttribute("textContent"));
		}
		else
		{
			System.err.println("Not dispalyed");
		}
		Thread.sleep(3000);
		b.close();
		
}
}