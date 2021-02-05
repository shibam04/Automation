import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		  b.get("https://jqueryui.com/draggable/");
	 WebElement s=b.findElement(By.xpath("//iframe[@class='demo-frame']"));
	 b.switchTo().frame(s);
	 Thread.sleep(2000);
	 WebElement z=b.findElement(By.id("draggable"));
	 Actions v=new Actions(b);
	 Thread.sleep(2000);
	 v.dragAndDropBy(z, 300, 0).perform();
	 
}
}
