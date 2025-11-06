package newpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Laptops");
		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("Jeans");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Jeans");
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("T-Shirts");
	}

}
