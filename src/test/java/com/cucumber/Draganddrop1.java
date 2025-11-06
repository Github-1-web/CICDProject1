package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(iframe);
		WebElement sourceele=driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement targetele=driver.findElement(By.xpath("//div[@id='trash']"));
		Actions actions=new Actions(driver);
		actions.dragAndDrop(sourceele, targetele).build().perform();
		
	}

}
