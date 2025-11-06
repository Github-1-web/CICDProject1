package testngpkg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions 
{
   @Test
   void m()
   {
	   System.out.println("Assertions");
	   Assert.assertEquals(123,123);
	   Assert.assertNotEquals(113,123);
	   Assert.assertTrue(1==2);
	   Assert.assertFalse(1==2);
	   Assert.assertTrue(true);
	   Assert.assertFalse(false);
   }
}
