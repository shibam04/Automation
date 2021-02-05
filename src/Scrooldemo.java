import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrooldemo 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
	//	b.manage().window().maximize();
		b.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		b.get("https://www.amazon.in/");
		Thread.sleep(1000);
		JavascriptExecutor j=(JavascriptExecutor)b;
		Thread.sleep(5000);
		/*j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(0,-200)");*/
	    j.executeScript("window.scrollBy(600,0)");
		Thread.sleep(1000);
		j.executeScript("window.scrollBy(-100,0)");
		/*j.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		j.executeScript("window.scrollBy(0,-document.body.scrollHeight)");*/
		/*WebElement c=b.findElement(By.xpath("//h2[contains(.,'Stand for Handmade')]"));
		j.executeScript("arguments[0].scrollIntoView()",c);*/
		
		
		
}
}
