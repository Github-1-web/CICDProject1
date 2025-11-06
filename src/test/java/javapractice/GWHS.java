package javapractice;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GWHS {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Try it Yourself »")).click();
		Set<String> windowids=driver.getWindowHandles();
		System.out.println(windowids);
	}

}
