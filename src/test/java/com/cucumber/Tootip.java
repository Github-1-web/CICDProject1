package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Tootip {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement cart=driver.findElement(By.xpath("//a[text()='Cart']"));
		Actions actions=new Actions(driver);
		actions.contextClick(cart).build().perform();
		System.out.println(cart.getText());
	}

}
