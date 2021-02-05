import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement createnew=b.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
		System.out.println(createnew.isEnabled());
		if(createnew.isEnabled())
			createnew.click(); 
		Thread.sleep(4000);
		WebElement male= b.findElement(By.xpath("//input[@class='_8esa' and @value=2]"));
		if(male.isDisplayed())
			male.click(); 
		System.out.println(male.isDisplayed());
		System.out.println(male.getCssValue("background-color"));
		System.out.println(male.getRect().getPoint());
	}
}

