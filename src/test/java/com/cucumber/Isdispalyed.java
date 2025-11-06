package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isdispalyed {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/");
		WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
		boolean status=logo.isDisplayed();
		System.out.println("status of the logo is "+status);
	}

}
