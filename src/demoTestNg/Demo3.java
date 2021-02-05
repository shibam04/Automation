package demoTestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo3 
{
	 @Test(invocationCount=3,priority=3,enabled=true)
	  public void ts1()
	  {
		  Reporter.log("Hi****", true);
	  }
	 @Test(invocationCount=1,priority=1,dependsOnMethods="ts3")
	  public void ts2()
	  {
		  Reporter.log("Hello****", true);
	  }
	 @Test(invocationCount=1,priority=2)
	  public void ts3()
	  {
		  Reporter.log("Bye****", true);
	  }
	 @Test(dependsOnMethods="ts5")
	  public void ts4()
	  {
		  Reporter.log("Bye****", true);
		  
	  }
	 @Test(enabled=false)
	  public void ts5()
	  {
		  Reporter.log("Bye1****", true);
		 
	  }
	 @Test()
	  public void ts6()
	  {
		  Reporter.log("Bye2****", true);
		 
	  }
	 @Test()
	  public void ts7()
	  {
		  Reporter.log("Bye3****", true);
		  
	  }
}
