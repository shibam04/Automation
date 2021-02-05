import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook04 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.facebook.com/");
		Thread.sleep(2000);
		b.findElement(By.xpath("//a[@class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		Thread.sleep(3000);
		WebElement day= b.findElement(By.name("birthday_day"));
		Select s=new Select(day);
		s.selectByVisibleText("4");
		WebElement month= b.findElement(By.name("birthday_month"));
		Select s1=new Select(month);
		s1.selectByVisibleText("Jul");
		WebElement year= b.findElement(By.name("birthday_year"));
		Select s2=new Select(year);
		s2.selectByValue("2013");
	}
}
