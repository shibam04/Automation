import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exp03 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.naukri.com/");
		String parent=b.getWindowHandle();
		System.out.println("PARENT:"+parent);
		Set<String> winshandel=b.getWindowHandles();
		//winshandel.remove(parent);
		ArrayList<String> a=new ArrayList<String>(winshandel);
		System.out.println(winshandel.getClass());
		for(int i=a.size()-1;i>=0;i--)
		{
			
			b.switchTo().window(a.get(i));
			b.close();
			Thread.sleep(2000);
			
		}
		
		
	}
}
