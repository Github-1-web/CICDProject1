package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Draganddrop {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://codepen.io/EpsilonDeltaCriterion/pen/jLoPgE");
		driver.switchTo().frame("result");
		WebElement sourceele=driver.findElement(By.xpath("//div[text()='Washington'][2]"));
		WebElement targetele=driver.findElement(By.xpath("//div[text()='United States']"));
		Actions actions=new Actions(driver);
		Thread.sleep(5000);
		actions.dragAndDrop(sourceele, targetele).build().perform();
		
	}

}
