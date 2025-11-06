package Excel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SWT1 {

	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.letskodeit.com/practice");
		List<WebElement> rows=driver.findElements(By.xpath("//table[@name='courses']//tr"));
		List<WebElement> cols=driver.findElements(By.xpath("//table[@name='courses']//tr//th"));
		String value=driver.findElement(By.xpath("//table[@name='courses']//tr[2]//td[3]")).getText();
		System.out.print(value);
		System.out.println();
		for(int r=2;r<=rows.size();r++)
		{
			for(int c=1;c<=cols.size();c++)
			{
				String data=driver.findElement(By.xpath("//table[@name='courses']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(data+"\t");
			}
			System.out.println();
		}
		
	}

}
