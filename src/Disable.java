import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Disable 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("file:///C:/Users/shiba/OneDrive/Desktop/DisabledText.html");
		WebDriverWait w=new  WebDriverWait(b,10);
		b.findElement(By.id("abc")).sendKeys("name");
		w.until(new ExpectedCondition<Boolean>()
		{

			@Override
			public Boolean apply(WebDriver arg0) 
			{

				return ! b.findElement(By.id("xyz")).isEnabled();
			}
			
		});
		b.findElement(By.id("pqr")).sendKeys("Shibam");
		
	}
}
