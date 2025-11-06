package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Innerframe {

	public static void main(String[] args) 
	{
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://ui.vision/demo/webtest/frames/");
       WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@class='AB7Lab Id5V1']")).click();
	}

}
