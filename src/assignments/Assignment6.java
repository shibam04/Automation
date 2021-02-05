package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment6 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/jewellery.html");
		b.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("rings",Keys.ENTER);
		Actions a=new Actions(b);
		WebElement x=b.findElement(By.xpath("//span[@class='title style-fill i-right']/span[contains(text(),'Price')]"));
		a.moveToElement(x).perform();
		b.findElement(By.xpath("//span[@data-displayname='below rs 10000']")).click();
		List<WebElement> l=b.findElements(By.xpath("//img[@class='hc img-responsive center-block']"));
		System.out.println("Count of Ring Below Rs 10000.0:"+l.size());
		
		
		
}
}
