import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Visibility 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("file:///C:/Users/shiba/OneDrive/Desktop/VisibilityOfTextbox.html");
		WebDriverWait w=new  WebDriverWait(b,10);
		w.until(ExpectedConditions.visibilityOf(b.findElement(By.id("iamtextbox"))));
		b.findElement(By.id("iamtextbox")).sendKeys("Shibam");
		
	}
}