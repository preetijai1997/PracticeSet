package test;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		/*
		
		driver.get("https://www.google.com/");
		
		
		WebElement searchBox=driver.findElement(By.name("q"));
		searchBox.sendKeys("Way2Automation");
		driver.findElement(By.xpath("(//input[@value='Google Search'])[2]")).click();
		driver.findElement(By.xpath("//h3[text()='Way2Automation: Get Online Selenium Certification Course']")).click();
		
		List<WebElement> links=driver.findElements(By.tagName("//a"));
		
		int count=0;
		for(int i=0;i<links.size();i++)
		{
			System.out.println("Link Text " + links.get(i).getText()  );
			count++;
			
		}
		System.out.println("Total num of link is : "+ count);
		*/
		
		driver.get("https://portal.bankit.in:9090/RO/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("Main");
		System.out.println("11111111111111111111111111"+ driver.findElements(By.tagName("a")));
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		int count=0;
	for(int i=0; i<links.size();i++)
	{
		System.out.println("0000000000000000");
		System.out.println("Link Text is " + links.get(i).getText());
		count++;
	}
	
	System.out.println("Total number of count is : "+ count);

}
}
