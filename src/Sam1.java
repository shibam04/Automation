import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sam1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("file:///C:/Users/shiba/OneDrive/Desktop/sam1.html");
		WebElement s=b.findElement(By.xpath("//body/div[1]/descendant::input[@name='textA']"));
		s.sendKeys("Name");
		WebDriverWait w=new  WebDriverWait(b,10);
		w.until(ExpectedConditions.textToBePresentInElementValue(By.name("textA"), "Name"));
		b.findElement(By.name("textB")).sendKeys("Shibam");
		
	}

}
