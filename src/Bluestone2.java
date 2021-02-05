import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Bluestone2 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/jewellery.html");
		List<WebElement> menu=	b.findElements(By.xpath("//ul[@class='wh-main-menu']/li"));
		Actions a=new Actions(b);
		Thread.sleep(1000);
		for(WebElement menuName:menu)
		{
			String menu1=menuName.getText();

			System.err.println(menu1);
			a.moveToElement(menuName).perform();
			Thread.sleep(3000);
			List<WebElement> submenu= b.findElements(By.xpath("//a[@title='"+menu1+"']/following::li"));

			for(WebElement e:submenu)
			{
				System.out.println(e.getText());
			}
			Thread.sleep(3000);
		}
	}
}
