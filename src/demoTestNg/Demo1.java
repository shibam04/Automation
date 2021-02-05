package demoTestNg;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Demo1 extends Demo1parent
{
	//WebDriver b;
	/*@BeforeMethod
	public void beforem() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");

	    b=new ChromeDriver();
		b.manage().window().maximize();
		b.get("https://www.google.com/");
		Thread.sleep(2000);
	}*/
	@Test
	public void tc1() throws InterruptedException
	{
		WebElement search=b.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("java",Keys.ENTER);
		System.out.println("Testcase1");

	}
	@Test
	public void tc2() throws InterruptedException
	{
		WebElement search=b.findElement(By.xpath("//input[@aria-label='Search']"));
		search.sendKeys("resume",Keys.ENTER);
		System.out.println("TestCase2");


	}
	/*@AfterMethod
	public void afterm() throws InterruptedException
	{
		b.close();
	}*/

}
