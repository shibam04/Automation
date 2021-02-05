package assignments;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Royce 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		
			 WebDriver b=new ChromeDriver();
			 b.get("https://www.rolls-roycemotorcars.com/");
}
}
