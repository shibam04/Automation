import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.amazon.in/?ext_vrnc=hi&tag=googhydrabk-21&ascsubtag=_k_Cj0KCQiA88X_BRDUARIsACVMYD94qWuXireKF5lwLW06a8NaCiE4nBisAadH6_PvbQTtTG_eTKUXJ_EaApN4EALw_wcB_k_&ext_vrnc=hi&gclid=Cj0KCQiA88X_BRDUARIsACVMYD94qWuXireKF5lwLW06a8NaCiE4nBisAadH6_PvbQTtTG_eTKUXJ_EaApN4EALw_wcB");

		Thread.sleep(1000);
		
		WebElement search=b.findElement(By.xpath("//input[@name='field-keywords']"));
		search.sendKeys("iphone",Keys.ENTER);
		b.findElement(By.xpath("//img[@alt='Apple iPhone 7 (32GB) - Black']")).click();
		

	}
}
