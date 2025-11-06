package javapractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nav2 {

	public static void main(String[] args) throws MalformedURLException 
	{
		WebDriver driver=new ChromeDriver();
		URL myurl=new URL("https://demo.nopcommerce.com/");
		driver.navigate().to(myurl);
	}

}
