package javapractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitle {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		String act_title=driver.getTitle();
		String exp_title="nopCommerce demo store. Home page title";
		if(act_title.equals(exp_title))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	}

}
