package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment7 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.bluestone.com/jewellery.html");
		b.findElement(By.xpath("//input[@class='form-text typeahead']")).sendKeys("rings",Keys.ENTER);
		Actions a=new Actions(b);
		WebElement x=b.findElement(By.xpath("//span[contains(text(),'Delivery Time')]/parent::span[@class='title style-fill i-right']"));
		a.moveToElement(x).perform();
		Thread.sleep(4000);
		b.findElement(By.xpath("//span[@data-displayname='next day delivery' ] /parent::div/parent::div/parent::div")).click();
		Thread.sleep(3000);
		List<WebElement> l=b.findElements(By.xpath("//div[@class='p-image']"));
		System.out.println(l.size());
		
}
}
