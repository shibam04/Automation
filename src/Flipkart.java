import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.flipkart.com/");

		Thread.sleep(1000);
		b.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		/*WebElement search=b.findElement(By.xpath("//input[@title='Search for products, brands and more']"));
		search.sendKeys("iphone",Keys.ENTER);
		b.findElement(By.xpath("//a[@class='s1Q9rs' and @title='Apple iPhone SE (Black, 64 GB) (Includes EarPods, Power Adapter)'] ")).click();
		Thread.sleep(1000);*/
		List<WebElement> menus=b.findElements(By.xpath("//div[@class='_1kidPb']/span"));
		for(WebElement a:menus)
		{
			System.out.println(a.getText());
		}
		List<WebElement> menu=b.findElements(By.xpath("//div[@class='_1kidPb']/descendant::a"));
		for(WebElement a:menu)
		{
			System.out.println(a.getText());
		}
		

	}
}
