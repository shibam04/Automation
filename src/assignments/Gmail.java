package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.gecko.driver", "./software/geckodriver.exe");
		FirefoxDriver d=new FirefoxDriver();
		d.manage().window().maximize();
		d.get("https://accounts.google.com/ServiceLogin/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail&sacu=1&passive=1209600&hl=en&acui=0&flowName=GlifWebSignIn&flowEntry=AddSession&cid=3&TL=AM3QAYb1eJyZIJKCQM4TfR00wovQSwjw2pdwsiTs6mV8Dq4JQv4gNjhut1BvbQ0V");
		d.findElement(By.xpath("//input[@id='identifierId']")).sendKeys("shibam.seal4");
	}
}

