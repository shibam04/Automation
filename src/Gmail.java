import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&osid=1&service=mail&ss=1&ltmpl=default&rm=false&flowName=GlifWebSignIn&flowEntry=AddSession");
		  Thread.sleep(2000);
		  WebElement search=b.findElement(By.id("identifierId"));
		  search.sendKeys("shibam.seal4");
		  WebElement next=b.findElement(By.id("identifierNext"));
		  next.click();
		 
		 
	   }
}
