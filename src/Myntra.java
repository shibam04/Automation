import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.get("https://www.myntra.com/?utm_source=Google&utm_medium=cpc&utm_campaign=Search%20-%20Myntra%20Brand%20(India)&gclid=CjwKCAiA_9r_BRBZEiwAHZ_v161mieGpaXMHp6CJnHVPjm6NYjbtCj-dRp_ej5V9b555hjYACHafNRoCQFEQAvD_BwE");
		List<WebElement> a= b.findElements(By.xpath("//div[@class='desktop-navLink']"));
		for(WebElement menu:a)
		{
			System.out.println(menu.getText());
		}
		List<WebElement> x= b.findElements(By.xpath("//span[@class='desktop-userTitle']"));
		for(WebElement menus:x)
		{
			System.out.println(menus.getText());
		}
}
}
