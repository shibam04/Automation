import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actime04 
{
	public static void main(String[] args) throws InterruptedException 
	   {
		 System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
		 WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		 b.get("https://demo.actitime.com/login.do");
		 WebElement s=b.findElement(By.xpath("//b[contains(.,'admin')]"));
		 WebElement s1=b.findElement(By.xpath("//b[contains(.,'manager')]"));
		 WebElement s2=b.findElement(By.xpath("//input[contains(@name,'username')]"));
		 WebElement s3=b.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		 s2.sendKeys(s.getText());
		 s3.sendKeys(s1.getText());
		 WebElement s4=b.findElement(By.xpath("//a[@id='loginButton']"));
		 s4.click();
		 Thread.sleep(2000);
		 b.findElement(By.xpath("//div[@id='addTaskButtonId']")).click();
		 Thread.sleep(4000);
		 b.findElement(By.xpath("//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/descendant::div[@class='dropdownButton']")).click();
		 Thread.sleep(3000);
		b.findElement(By.xpath("//div[@class='contentWrapper ']/descendant::div[@class='searchItemList']/div[contains(.,'- New Customer -')]")).click();
	
		 WebElement s5= b.findElement(By.xpath("//input[@class='newCustomer newCustomerProjectField inputFieldWithPlaceholder']"));
		 s5.sendKeys("Shibam");
		 WebElement s6= b.findElement(By.xpath("//input[@class='newProject newCustomerProjectField inputFieldWithPlaceholder']"));
		 s6.sendKeys("IOT");
		b.findElement(By.xpath("//div[@class='components_button withPlusIcon']")).click();
		Thread.sleep(3000);
		 String error= b.findElement(By.xpath("//div[@class='basicLightboxFooter']/div[@class='errorMessageBox']")).getText();
		 System.err.println(error);
}
}
