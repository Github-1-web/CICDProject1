package testng2;

import org.testng.annotations.Test;

public class Logintest 
{
   @Test(priority=1,groups= {"smoke"})
   void Loginbygmail()
   {
	   System.out.println("This is login by gmail");
   }
   @Test(priority=2,groups= {"smoke"})
   void Loginbyfacebook()
   {
	   System.out.println("This is login by facebook");
   }
   @Test(priority=3,groups= {"smoke"})
   void Loginbyskype()
   {
	   System.out.println("This is login by skype");
   }
}
