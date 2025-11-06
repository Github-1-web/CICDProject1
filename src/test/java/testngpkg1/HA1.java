package testngpkg1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HA1 
{
    @Test
    void test_hardasserion()
    {
    	System.out.println("This is first test");
    	System.out.println("This is second test");
    	Assert.assertEquals(111,111);
    	System.out.println("This is third test");
    	System.out.println("This is fourth test");
    }
}
