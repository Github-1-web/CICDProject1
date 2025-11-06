package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		Thread.sleep(5000);
	driver.switchTo().frame("iframeResult");
	WebElement field1=driver.findElement(By.id("field1"));
	WebElement cpybtn=driver.findElement(By.xpath("//button[text()='Copy Text']"));
	field1.clear();
	field1.sendKeys("J Srinath");
		Actions actions=new Actions(driver);
		actions.doubleClick(cpybtn).build().perform();
	}

}
