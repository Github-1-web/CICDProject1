package testngpkg1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Test1 {

	@BeforeClass
     void login()
     {
		System.out.println("This is login");
     }
	@Test
	void search()
	{
		System.out.println("This is search");
	}
	@Test
	void advsearch()
	{
		System.out.println("This is adv search");
	}
	@AfterClass
	void logout()
	{
		System.out.println("This is logout");
	}
}
