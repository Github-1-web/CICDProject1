package com.cucumber;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Confirmation1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert confirmation=driver.switchTo().alert();
		confirmation.dismiss();
		String act_text=driver.findElement(By.xpath("//p[text()='You clicked: Cancel']")).getText();
		if(act_text.equals("You clicked: Cancel"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		
		
	}

}
