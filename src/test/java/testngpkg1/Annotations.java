package testngpkg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations {
	@BeforeSuite
	void bs()
	{
		System.out.println("This before suite method");
	}
	@AfterSuite
	void as()
	{
		System.out.println("This before suite method");
	}
	@BeforeTest
	void bt()
	{
		System.out.println("This before test method");
	}
	@AfterTest
	void at()
	{
		System.out.println("This before test method");
	}
	@BeforeClass
	void bc()
	{
		System.out.println("This before class method");
	}
	@AfterClass
	void ac()
	{
		System.out.println("This before class method");
	}
	@Test
	void m1()
	{
		System.out.println("This is m1 test");
	}
	@Test
	void m2()
	{
		System.out.println("This is m2 test");
	}

}
