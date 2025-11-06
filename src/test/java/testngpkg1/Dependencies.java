package testngpkg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Dependencies 
{
     @Test(priority=1)
     void open()
     {
    	 Assert.assertTrue(true);
     }
     @Test(priority=2)
     void login()
     {
    	 Assert.assertTrue(false);
     }
     @Test(priority=3,dependsOnMethods= {"login"})
     void search()
     {
    	 Assert.assertTrue(true);
     }
     @Test(priority=4)
     void advsearch()
     {
    	 Assert.assertTrue(true);
     }
     @Test(priority=5)
     void logout()
     {
    	 Assert.assertTrue(true);
     }
}
