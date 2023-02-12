package test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewTabAndWindow {

	public static void main(String[] args) {
             
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demoqa.com/browser-windows");
		
		Set<String> window=driver.getWindowHandles();
		Iterator<String> it=window.iterator();
         String parentWindow=it.next();
        
		driver.findElement(By.id("windowButton")).click();
		 
		while(it.hasNext())
		{
			String childWindow=it.next();
			if(!parentWindow.equals(childWindow))
			{
				it.next();
			}
		}
		
	   System.out.println(driver.getTitle());
	   driver.switchTo().window(parentWindow);
	   driver.findElement(By.id("tabButton")).click();
	   
	   while(it.hasNext())
		{
			String childWindow=it.next();
			if(!parentWindow.equals(childWindow))
			{
				it.next();
			}
		}
		
	   System.out.println(driver.getTitle());
	   
		
		
		
	}

}
