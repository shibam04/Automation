package demoTestNg;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ChecKDemo 
{
  @Test
  public void tc()
  {
	 String st1="SHIBAM";
	 String st2="SHIBAM";
	 Assert.assertEquals(st1, st2);
	 Reporter.log("Matched", true);
	 List<Object> l1=new ArrayList<>();
	 l1.add(true);
	 l1.add("Abc");
	 l1.add(99);
	 List<Object> l2=new ArrayList<>();
	 l2.add(true);
	 l2.add("Abc");
	 l2.add(99);
	 Assert.assertEquals(l1, l2);
	 Reporter.log("Matched1", true);
	 SoftAssert sa=new SoftAssert();
	 sa.assertEquals("Abc", "Abc");
	 Reporter.log("MatchedSa", true);
	 sa.assertAll();
	// Assert.fail();
	 
   }
}
