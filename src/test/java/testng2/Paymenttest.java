package testng2;

import org.testng.annotations.Test;

public class Paymenttest 
{
	@Test(priority=1,groups= {"smoke","regression","functional"})
	   void Paymentinruppees()
	   {
		   System.out.println("Payment in ruppess");
	   }
	   @Test(priority=2,groups= {"smoke","regression","functional"})
	   void Paymentindollars()
	   {
		   System.out.println("Payment in dollars");
	   }
}
