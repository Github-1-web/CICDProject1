package testng5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Paralleltesting4 
{
	WebDriver driver;
  @Parameters({"browser","url"})
  @BeforeClass
  void setup(String br,String url)
  {
	  switch(br.toLowerCase())
	  {
	  case "chrome":driver=new ChromeDriver();break;
	  case "edge":driver=new EdgeDriver();break;
	  case "firefox":driver=new FirefoxDriver();break;
	  }
	  driver.manage().window().maximize();
	  driver.get(url);
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }
  @Test
  void testlogo() throws InterruptedException
  {
	  Thread.sleep(5000);
	   boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	   Assert.assertTrue(status);
  }
  @Test
  void testurl()
  {
	   String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	   Assert.assertEquals(url,driver.getCurrentUrl());
  }
  @AfterClass
  void close()
  {
	   driver.quit();
   }
}
