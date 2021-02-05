import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Authentication 
{
   public static void main(String[] args) 
   {
	   System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	   WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get(" https://admin:admin@the-internet.herokuapp.com/basic_auth");
}
}
