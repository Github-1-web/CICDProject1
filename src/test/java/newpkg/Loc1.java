package newpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loc1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.name("firstname")).sendKeys("Allu");
		driver.findElement(By.name("lastname")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@value='2']")).click();
		driver.findElement(By.name("reg_email__")).sendKeys("9848032919");
		driver.findElement(By.name("reg_passwd__")).sendKeys("9848032919");
	}

}
