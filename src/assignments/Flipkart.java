package assignments;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.flipkart.com/");
		Thread.sleep(1000);
		b.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		b.findElement(By.xpath("//input[@title='Search for products, brands and more']")).sendKeys("C#",Keys.ENTER);
		Thread.sleep(3000);
	    b.findElement(By.xpath("//div[contains(text(),'Price -- Low to High')]")).click();
	    Thread.sleep(5000);
	   WebElement s= b.findElement(By.xpath("//div[contains(text(),'4.6')]"));
	   Thread.sleep(3000);
	   Actions a=new Actions(b);
	   a.moveToElement(s).perform();
	   Thread.sleep(5000);
	   System.out.println("Before switching tabs:"+b.getTitle());
	    if(s.getText().equals("4.6"))
	    {
	    	b.findElement(By.xpath("//img[@class='_396cs4  _3exPp9' and @alt='The Survivor']")).click();
	    	Thread.sleep(4000);
	    }
        Set<String> wins=b.getWindowHandles();	
		for(String win:wins)
		{
			b.switchTo().window(win);
		}
		System.out.println("After switching tabs:"+b.getTitle());
		b.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	    	
	}
}
