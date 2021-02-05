package org.qsp.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UrbamTest 
{

	   @FindBy(xpath = "//a[@class='close-reveal-modal hide-mobile']") 
	   private WebElement close;
	   @FindBy(xpath = "//span[contains(.,'Living')]/parent::li") 
	   private WebElement living;
	   @FindBy(xpath = "//span[contains(.,'Fabric Sofa Sets')]") 
	   private WebElement sofa;
	   
	   public UrbamTest(WebDriver driver)
	   {
		   PageFactory.initElements(driver, this);
	   }
	   public void closeClick()
	   {
		  close.click();
	   }
	   public void Living(WebDriver driver)
	   {
		 Actions a=new Actions(driver);
		 a.moveToElement(living).perform();
	   }
	   public void sofa()
	   {
		  sofa.click();
	   }
}
