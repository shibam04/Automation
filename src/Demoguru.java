import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demoguru 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("http://demo.guru99.com/test/simple_context_menu.html");
		WebElement s=b.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(b);
		a.contextClick(s).perform();//Right click
		a.doubleClick(b.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"))).perform();
	}
}
