package demoTestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo2 
{
  @BeforeSuite
  public void bs()
  {
	  System.out.println("Before suite");
  }
  @BeforeTest
  public void tests()
  {
	  System.out.println("Before test");
  }
  @BeforeClass
  public void cs()
  {
	  System.out.println("Before class");
  }
  @BeforeMethod
  public void ms()
  {
	  System.out.println("Before method");
  }
  @Test
  public void ts1()
  {
	  System.out.println("Test Case1");
  }
  @Test
  public void ts2()
  {
	  System.out.println("Test Case2");
  }
  @AfterMethod
  public void ms1()
  {
	  System.out.println("After method");
  }
  @AfterClass
  public void cs1()
  {
	  System.out.println("After class");
  }
  @AfterTest
  public void test()
  {
	  System.out.println("After test");
  }
  @AfterSuite
  public void bs1()
  {
	  System.out.println("After suite");
  }
}
