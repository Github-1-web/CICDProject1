package newpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.findElement(By.linkText("REGISTER")).click();
		driver.findElement(By.name("firstName")).sendKeys("Allu");
		driver.findElement(By.name("lastName")).sendKeys("Arjun");
		driver.findElement(By.name("phone")).sendKeys("9848032919");
		driver.findElement(By.name("userName")).sendKeys("Allu@arjun");
		driver.findElement(By.name("address1")).sendKeys("Ameerpet");
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		driver.findElement(By.name("state")).sendKeys("TG");
		driver.findElement(By.name("postalCode")).sendKeys("500045");
		
	}

}
