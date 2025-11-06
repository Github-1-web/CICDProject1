package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Isselected {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
		WebElement male_rtbn=driver.findElement(By.id("gender-male"));
		WebElement female_rtbn=driver.findElement(By.id("gender-female"));
		System.out.println("Status of the male radio button "+male_rtbn.isSelected());
		System.out.println("Status of the female radio button "+female_rtbn.isSelected());
		male_rtbn.click();
		System.out.println("Status of the male radio button "+male_rtbn.isSelected());
		System.out.println("Status of the female radio button "+female_rtbn.isSelected());
	}

}
