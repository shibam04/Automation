import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		  b.get("https://www.google.com/");
		  Thread.sleep(2000);
		 // WebElement search=b.findElement(By.name("q"));
		  WebElement search=b.findElement(By.xpath("//input[@aria-label='Search']"));
		  search.sendKeys("java",Keys.ENTER);
		  boolean x=b.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();
		  while(x)
		  {
			  b.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
			  Thread.sleep(2000);
			  x=b.findElement(By.xpath("//span[contains(text(),'Next')]")).isDisplayed();
		  }
		 
	   }
}
