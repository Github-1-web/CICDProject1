package testng2;

import org.testng.annotations.Test;

public class Signuptest 
{
	@Test(priority=1,groups= {"regression"})
	   void Signupbygmail()
	   {
		   System.out.println("This is Signup by gmail");
	   }
	   @Test(priority=2,groups= {"regression"})
	   void Signupbyfacebook()
	   {
		   System.out.println("This is Signup by facebook");
	   }
	   @Test(priority=3,groups= {"regression"})
	   void Signupbyskype()
	   {
		   System.out.println("This is Signup by skype");
	   }
}
