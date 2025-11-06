package com.cucumber;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Promptalert {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("J Srinath");
		prompt.accept();
		String act_text=driver.findElement(By.xpath("//p[text()='You entered: J Srinath']")).getText();
		if(act_text.equals("You entered: J Srinath"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	}

}
