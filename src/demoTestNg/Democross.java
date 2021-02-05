package demoTestNg;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class Democross 
{
	@Parameters("browser")
	@Test
	public void TC1(String browser) throws InterruptedException
	{
		WebDriver b=null;
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
			b=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
			b=new FirefoxDriver();
		}
		else
		{
			b=null;
		}

		b.manage().window().maximize();
		b.get("https://www.google.com/");
		Thread.sleep(2000);
		b.close();
	}

}
