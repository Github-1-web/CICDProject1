package com.cucumber;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement Username=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
		Username.sendKeys("Admin");
		WebElement Password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
		Password.sendKeys("admin123");
	}

}
