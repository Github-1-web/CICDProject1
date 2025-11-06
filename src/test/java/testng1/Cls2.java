package testng1;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Cls2 {
	@Test
	void m2()
	{
		System.out.println("This m2 method from Cls2");
	}
	@BeforeTest
	void m4()
	{
		System.out.println("This m4 method from Cls2");
	}

}
