import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google2 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		 ChromeDriver a=new ChromeDriver();
		 WebDriver b=new ChromeDriver();//
		 b.manage().window().maximize();
		 b.get("https://www.google.com/");
		 Thread.sleep(3000);
		 WebElement search=b.findElement(By.name("q"));
		 search.sendKeys("java",Keys.ENTER);
		 Thread.sleep(3000);
		 WebElement value=b.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		 System.out.println(value.getAttribute("value"));
		 value.clear();
		 Thread.sleep(3000);
		 b.findElement(By.name("q")).sendKeys("TestNg",Keys.ENTER);
		 
		
}
}
