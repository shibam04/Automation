import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Urbanladder 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		  
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		  b.get("https://www.urbanladder.com/");
		  Thread.sleep(10000);
		  b.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		  Thread.sleep(10000);
		  b.findElement(By.xpath("//ul[@class='featuredLinksBar__linkContainer']/descendant::a[contains(.,'Stores')]")).click();
		  WebElement a= b.findElement(By.xpath("//h3[@class='_3JJeW' and contains(.,'Hadapsar, Pune')]"));
		  System.out.println(a.getText());
	   }
}

