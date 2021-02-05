import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exp1 
{
   public static void main(String[] args) 
   {
	 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
	 ChromeDriver a=new ChromeDriver();
	 // System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
	 //FirefoxDriver d=new FirefoxDriver();
	 WebDriver b=new ChromeDriver();
	 b.get("https://www.google.com/");
	 b.close();
	 
   }
}
