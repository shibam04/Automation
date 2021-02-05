
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Exp05
{
   public static void main(String[] args) throws InterruptedException 
   {
	 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	 
	 WebDriver b=new ChromeDriver();
	 b.manage().window().maximize();
	 /*b.get("https://www.google.com/");
	  Thread.sleep(2000);
	  WebElement search=b.findElement(By.name("q"));
	  search.sendKeys("java");*/
	  b.get("https://www.facebook.com/");
	  Thread.sleep(2000);
	   WebElement search=b.findElement(By.xpath("//input[@aria-label='Email address or phone number']"));
	  search.sendKeys("shibam04");
	  WebElement search1=b.findElement(By.xpath("//input[@placeholder='Password']"));
	  search1.sendKeys("hello");
	  WebElement login=b.findElement(By.xpath("u_0_b"));
	  login.click();
	 /* WebElement search=b.findElement(By.id("email"));
	  search.sendKeys("shibam04");
	  WebElement search1=b.findElement(By.id("pass"));
	  search1.sendKeys("hello");
	  WebElement login=b.findElement(By.id("u_0_b"));
	  login.click();*/
	 // b.findElement(By.linkText("Forgotten password?")).click();
	 
	 
   }
}