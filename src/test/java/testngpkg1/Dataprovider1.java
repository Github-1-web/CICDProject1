package testngpkg1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprovider1 
{
	WebDriver driver;
    @BeforeClass
    void setup()
    {
    	driver=new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @Test(dataProvider="dp")
    void logintest(String email,String password)
    {
    	driver.findElement(By.name("email")).sendKeys(email);;
    	driver.findElement(By.name("password")).sendKeys(password);;
    	driver.findElement(By.xpath("//input[@value='Login']")).click();
    }
    @AfterClass
    void close()
    {
    	driver.quit();
    }
    @DataProvider(name="dp")
    Object[][] logindata()
    {
    	Object[][] data= {
    			{"abc@gmail.com","test123"},
    			{"xyz@gmail.com","test012"},
    			{"john@gmail.com","test1234"},
    			{"Arjun@gmail.com","test@123"},
    			{"Raj@gmail.com","test1235"}
    	};
    	return data;
    }
}
