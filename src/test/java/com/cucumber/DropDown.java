package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		WebElement country=driver.findElement(By.xpath("//select[@name='country']"));
		Select countrydropdown=new Select(country);
		countrydropdown.selectByVisibleText("ASHMORE AND CARTIER ISLANDS");
	}

}
