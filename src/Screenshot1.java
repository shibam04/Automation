import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Screenshot1 
{
	public static void main(String[] args) throws IOException, InterruptedException, AWTException 
	{
		System.setProperty("webdriver.chrome.driver", "./software/chromedriver.exe");
		WebDriver b=new ChromeDriver();
		b.manage().window().maximize();		
		 b.get("https://www.google.com/");
		/* TakesScreenshot h=(TakesScreenshot) b;
		 File screen=h.getScreenshotAs(OutputType.FILE);
		 File save=new File("./Screenshot/google.png");
	     Files.copy(screen,save);*/
		 ScreenShot(b,"google1");
		 
		 
	}
	public static void ScreenShot(WebDriver x,String name) throws IOException
	{
		TakesScreenshot h=(TakesScreenshot) x;
		 File screen=h.getScreenshotAs(OutputType.FILE);
		 File save=new File("./Screenshot/"+name+".png");
	      Files.copy(screen,save);
	}
}

