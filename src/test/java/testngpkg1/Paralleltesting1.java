package testngpkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Paralleltesting1 
{
	WebDriver driver;
   @Test(priority=1)
   void setup()
   {
	   driver=new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");   
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
   }
   @Test(priority=2)
   void testlogo() throws InterruptedException
   {
	   Thread.sleep(5000);
	   boolean status=driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
	   Assert.assertTrue(status);
   }
   @Test(priority=3)
   void testurl()
   {
	   String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	   Assert.assertEquals(url,driver.getCurrentUrl());
   }
   @Test(priority=4)
   void close()
   {
	   driver.quit();
   }
}
