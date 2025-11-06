package com.cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FUL1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.findElement(By.name("filesToUpload")).sendKeys("C:\\Folder1\\Dell\\Documents\\Textfile1.txt");
		String textfile=driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText();
		if(textfile.equals("Textfile1.txt"))
		{
			System.out.println("test pass");
		}
		else
		{
			System.out.println("test fail");
		}
		
	}

}
