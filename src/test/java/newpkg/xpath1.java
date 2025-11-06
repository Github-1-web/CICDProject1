package newpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath1 {

	public static void main(String[] args) 
	{
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/");
	    driver.findElement(By.xpath("//a[text()='Register']")).click();
	    driver.findElement(By.xpath("//input[@id='gender-male']")).click();
	    driver.findElement(By.xpath("//input[@name='FirstName']")).sendKeys("Allu");
	    driver.findElement(By.xpath("//input[@name='LastName']")).sendKeys("Arjun");
	    driver.findElement(By.xpath("//input[@name='Email']")).sendKeys("Allu@snehareddy");
	    
	}

}
