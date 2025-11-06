package com.cucumber;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Normal1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert normal=driver.switchTo().alert();
		normal.accept();
		String act_text=driver.findElement(By.xpath("//p[text()='You successfully clicked an alert']")).getText();
		if(act_text.equals("You successfully clicked an alert"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
	}

}
