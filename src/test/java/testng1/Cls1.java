package testng1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cls1 {

	@Test
	void m1()
	{
		System.out.println("This m1 method from Cls1");
	}
	@BeforeTest
	void m3()
	{
		System.out.println("This m3 method from Cls1");
	}
}
