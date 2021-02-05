import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp04
{
   public static void main(String[] args) throws InterruptedException 
   {
	 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	 ChromeDriver a=new ChromeDriver();
	 WebDriver b=new ChromeDriver();//launcing chrome driver
	 b.manage().window().maximize();
	// b.get("https://www.google.com/");
	  b.navigate().to("https://www.google.com/");
	 System.out.println(b.getCurrentUrl());
	 System.out.println(b.getTitle());
	 System.out.println(b.getPageSource());
	 b.navigate().back();
	 Thread.sleep(3000);
	 b.navigate().forward();
	 Thread.sleep(3000);
	 b.navigate().refresh();
	 b.quit();
	 a.quit();
	 
   }
}

