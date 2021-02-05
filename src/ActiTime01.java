import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTime01 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		 b.manage().window().maximize();
		b.get("https://demo.actitime.com/login.do");
		b.findElement(By.xpath("//div[contains(@class,'atLogoImg')]"));
		WebElement t=b.findElement(By.xpath("//div[contains(@class,'atProductName')]"));
		System.out.println(t.getText());
		WebElement identify=b.findElement(By.xpath("//td[contains(@id,'headerContainer')]"));
		System.out.println(identify.getText());
		WebElement Administrator=b.findElement(By.xpath("//td[contains(@rowspan,'2') and contains(@id,'adminCredentialsHeader')]"));
		System.out.println(Administrator.getText());
		WebElement user=b.findElement(By.xpath("//td[contains(@rowspan,'2') and contains(@id,'userCredentialsHeader')]"));
		System.out.println(user.getText());	 
		WebElement s2=b.findElement(By.xpath("//input[contains(@name,'username')]"));
		WebElement s3=b.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		WebElement trainee=b.findElement(By.xpath("//td[@id='userCredentialsUsername']/b[contains(.,'trainee')]"));
		System.out.println(trainee.getText());
		WebElement password=b.findElement(By.xpath("//tr/td[contains(.,'Password')]/b[contains(.,'trainee')]"));
		System.out.println(password.getText());
		s2.sendKeys(trainee.getText());
		s3.sendKeys(password.getText());
		WebElement Keepmelogin=b.findElement(By.xpath("//label[contains(@id,'keepLoggedInLabel')]"));
		System.out.println(Keepmelogin.getText());
		WebElement actitime=b.findElement(By.xpath("//nobr[contains(.,'actiTIME 2020 Online')]"));
		System.out.println(actitime.getText());
		WebElement s4=b.findElement(By.xpath("//a[@id='loginButton']"));
		s4.click();
		Thread.sleep(2000);
		WebElement s5=b.findElement(By.xpath("//a[contains(@id,'logoutLink')]"));
		s5.click();
		WebElement s=b.findElement(By.xpath("//b[contains(.,'admin')]"));
		 System.out.println(s.getText()); 
		 WebElement s1=b.findElement(By.xpath("//b[contains(.,'manager')]"));
		 System.out.println(s1.getText());
		 WebElement s6=b.findElement(By.xpath("//input[contains(@name,'username')]"));
		 WebElement s7=b.findElement(By.xpath("//input[contains(@name,'pwd')]"));
		 s6.sendKeys(s.getText());
		 s7.sendKeys(s1.getText());
		 WebElement s8=b.findElement(By.xpath("//a[@id='loginButton']"));
		 s8.click();
		  Thread.sleep(2000);
		// b.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_support popup_menu_button_pressed']//descendant::div[@class='menu_icon']")).click();
		
		 
		 
		 
		//WebElement s6=b.findElement(By.xpath("//a[contains(@id,'toPasswordRecoveryPageLink')]"));
		//s6.click();
	}
}
