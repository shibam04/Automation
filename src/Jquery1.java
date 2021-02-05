import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Jquery1 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		  b.get("https://jqueryui.com/droppable/");
		  Thread.sleep(2000);
	 WebElement s=b.findElement(By.xpath("//iframe[@class='demo-frame']"));
	 b.switchTo().frame(s);
	 Thread.sleep(2000);
	 WebElement z=b.findElement(By.id("draggable"));
	 Thread.sleep(2000);
	 WebElement y=b.findElement(By.id("droppable"));
	 Actions f=new Actions(b);
	 f.dragAndDrop(z, y).perform();
	 Thread.sleep(2000);
	 WebElement r=b.findElement(By.xpath("//div[@id='droppable']/p"));
	 System.out.println(r.getText());
	 
		
}
}
