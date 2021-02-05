package demoTestNg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class Demo4 
{
	 @Test(groups="Regression",dependsOnGroups="Functional")
	  public void ts1()
	  {
		  Reporter.log("1", true);
	  }
	 @Test(groups="Smoke")
	  public void ts2()
	  {
		  Reporter.log("2", true);
	  }
	 @Test(groups="Functional",dependsOnGroups="Smoke")
	  public void ts3()
	  {
		  Reporter.log("3", true);
	  }
	 @Test(groups="Smoke")
	  public void ts4()
	  {
		  Reporter.log("4", true);
		  Assert.fail();
		  
	  }
	 @Test(groups="Functional",dependsOnGroups="Smoke")
	  public void ts5()
	  {
		  Reporter.log("5", true);
		 
	  }
	 @Test(groups="Functional",dependsOnGroups="Smoke")
	  public void ts6()
	  {
		  Reporter.log("6", true);
		  Assert.fail();
		 
	  }
	 @Test(groups="Functional",dependsOnGroups="Smoke")
	  public void ts7()
	  {
		  Reporter.log("7", true);
		  
	  }
}
