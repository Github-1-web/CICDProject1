package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/resources/demos/slider/colorpicker.html");
		WebElement green=driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default' and @style='left: 54.902%;']"));
		Actions actions=new Actions(driver);
		System.out.println(green.getLocation());
		actions.dragAndDropBy(green,41,0).build().perform();
		System.out.println(green.getLocation());
	}

}
