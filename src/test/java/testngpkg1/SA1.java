package testngpkg1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SA1 
{
    @Test
    void test_softassertions()
    {
    	System.out.println("This is first test");
    	System.out.println("This is second test");
    	SoftAssert obj=new SoftAssert();
    	obj.assertEquals(111,123);
    	System.out.println("This is third test");
    	System.out.println("This is fourth test");
    	obj.assertAll();
    }
}
