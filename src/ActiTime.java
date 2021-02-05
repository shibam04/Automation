import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.get("https://demo.actitime.com/login.do");
		 b.findElement(By.linkText("Forgot your password?")).click();
		 String parent=b.getWindowHandle();
		 Set<String> winshandel=b.getWindowHandles();
		 System.out.println(winshandel.getClass());
		 b.findElement(By.partialLinkText("password?")).click();
		 b.findElement(By.xpath("//a[@id='toLoginPageLink']")).click();
		 Thread.sleep(2000);
		 WebElement s=b.findElement(By.xpath("//b[contains(.,'admin')]"));
		 System.out.println(s.getText());
		 

		 WebElement s1=b.findElement(By.xpath("//b[contains(.,'manager')]"));
		 System.out.println(s1.getText());
		
		// search.sendKeys("shibam04");
		 // WebElement search1=b.findElement(By.xpath("//input[@placeholder='Password']"));
		  //search1.sendKeys("hello");
		 WebElement s2=b.findElement(By.xpath("//input[contains(@name,'username')]"));
		 WebElement s3=b.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		 s2.sendKeys(s.getText());
		 s3.sendKeys(s1.getText());
		 WebElement s4=b.findElement(By.xpath("//a[@id='loginButton']"));
		 s4.click();
		/* WebElement trainee=b.findElement(By.xpath("//td[@id='userCredentialsUsername']/b[contains(.,'trainee')]"));
		 System.out.println(trainee.getText());
		 WebElement password=b.findElement(By.xpath("//tr/td[contains(.,'Password')]/b[contains(.,'trainee')]"));
		 System.out.println(password.getText());
		 s2.sendKeys(trainee.getText());
		 s3.sendKeys(password.getText());*/
		
	
	   }
}
