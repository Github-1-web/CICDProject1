package newpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath2 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.xpath("//input[@name='firstname' or @id='u_0_8_3p']")).sendKeys("Allu");
		driver.findElement(By.xpath("//input[@name='lastname' or @id='u_0_a_2K']")).sendKeys("Arjun");
		driver.findElement(By.xpath("//input[@class='_8esa' or @value='1']")).click();
		driver.findElement(By.xpath("//input[@name='reg_email__' or @id='u_0_h_fe']")).sendKeys("9848032919");
		driver.findElement(By.xpath("//input[@name='reg_passwd__' or @id='password_step_input']")).sendKeys("Abc@123");
		
	}

}
