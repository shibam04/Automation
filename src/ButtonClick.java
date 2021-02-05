import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ButtonClick 
{

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("file:///C:/Users/shiba/OneDrive/Desktop/ButtonClick.html");
		WebDriverWait w=new  WebDriverWait(b,10);
		WebElement s=b.findElement(By.id("otherBtn"));
		w.until(ExpectedConditions.elementToBeClickable(s));
		s.click();
		WebElement h=b.findElement(By.id("sBtn"));
		w.until(ExpectedConditions.elementToBeClickable(h));
		h.click();
	}
}
