package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movetoelement {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement electronics=driver.findElement(By.xpath("//span[text()='Electronics']"));
		Actions actions=new Actions(driver);
		actions.moveToElement(electronics).build().perform();
		WebElement cpp=driver.findElement(By.xpath("//a[text()='Computer Peripherals']"));
		actions.moveToElement(cpp).click().build().perform();
		
	}

}
