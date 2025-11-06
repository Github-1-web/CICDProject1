package testngpkg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testtitle {
  @Test
  void m()
   {
	  String act_title="IRCTC Home";
	  String exp_title="IRCTC Home";
	  if(act_title.equals(exp_title))
	    {
		  System.out.print("test pass");
		  Assert.assertEquals(act_title, exp_title);
	    }
	  else
	    {
		  System.out.print("test fail");
	    }
   }
}
