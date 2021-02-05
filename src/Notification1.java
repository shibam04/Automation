import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Notification1 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
			 WebDriver b=new ChromeDriver();
			 b.get("http://demo.guru99.com/v1/index.php");
			 b.findElement(By.name("btnLogin")).click();
			 Alert a=b.switchTo().alert();
			 System.out.println(a.getText());
			 a.accept();
	}
	
}
