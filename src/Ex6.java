import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex6 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		  b.get("https://www.urbanladder.com/");

		
		  Thread.sleep(12000);
		 b.findElement(By.xpath("//a[@class='close-reveal-modal hide-mobile']")).click();
		  WebElement s = b.findElement(By.xpath("//span[contains(.,'Sale')]"));
		  WebElement search=b.findElement(By.xpath("//input[@placeholder='Search']"));
		  System.out.println(s.getText());
		  search.sendKeys("sofa",Keys.ENTER);
		  b.findElement(By.xpath("//img[@title='Weston Half Leather Sofa (Camel Italian Leather)']")).click();
		
		  
		 
		 
	   }
}
