import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.get("file:///C:/Users/shiba/OneDrive/Desktop/multi.html");
		/*WebElement f= b.findElement(By.xpath("//select[@id='a']"));
		 Select s=new Select(f);
		 s.selectByIndex(1);*/
		 WebElement f1= b.findElement(By.id("b"));
		 Select s1=new Select(f1);
		 if(s1.isMultiple())
		 {
			List<WebElement> x=s1.getOptions();
			for(WebElement v:x)
			{
				s1.selectByValue(v.getText());
				Thread.sleep(2000);
			}
		 }
		 s1.deselectByIndex(2);
		 Thread.sleep(2000);
		 s1.deselectByValue("324");
		 Thread.sleep(2000);
		 s1.deselectByVisibleText("321");
		 Thread.sleep(2000);
		 System.out.println(s1.getFirstSelectedOption().getText());
		 List<WebElement> a=s1.getAllSelectedOptions();
		 for(WebElement v1:a)
		 {
			System.out.println(v1.getText());
		 }
		 s1.deselectAll();

	   }
}
