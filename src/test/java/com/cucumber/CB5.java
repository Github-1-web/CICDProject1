package com.cucumber;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CB5 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		List<WebElement> cbs=driver.findElements(By.xpath("//input[@name='cars' and @type='checkbox']"));
		for(WebElement cbx:cbs)
		{
			if(cbx.isSelected())
			{
				cbx.click();
			}
			else
			{
				cbx.click();
			}
		}
	}

}
