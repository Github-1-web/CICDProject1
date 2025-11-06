package javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Switch {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/default.asp");
		driver.findElement(By.linkText("Try it Yourself »")).click();
		Set<String> windowids=driver.getWindowHandles();
		List<String> wids=new ArrayList<String>(windowids);
		driver.switchTo().window(wids.get(0));
		Thread.sleep(5000);
		driver.switchTo().window(wids.get(1));
	}

}
