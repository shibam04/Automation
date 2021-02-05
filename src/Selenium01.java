import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium01 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://www.selenium.dev/");
		 Thread.sleep(4000);
		 WebElement search=b.findElement(By.xpath("//input[@autocomplete='off']"));
		 search.sendKeys("Java",Keys.ENTER);
		 b.navigate().back();
		 search.sendKeys("Testng");
}
}
