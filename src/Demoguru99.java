import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoguru99 
{
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("http://demo.guru99.com/test/upload/");
		Thread.sleep(3000);
		b.findElement(By.id("file_wraper0")).click();
		Thread.sleep(3000);
		Runtime r= Runtime.getRuntime();
        String st="B:/FileHandling/DEMO.exe";
        r.exec(st);
	}
}
