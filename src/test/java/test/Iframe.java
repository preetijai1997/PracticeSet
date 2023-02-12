package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_scripts_intro");
		
		List<WebElement> iframes=driver.findElements(By.tagName("iframe"));
		System.out.println(iframes.size());
		
		for(WebElement frame: iframes)
		{
			System.out.println(frame.getAttribute("id"));
		}
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@allowfullscreen='true']")));
		driver.findElement(By.xpath("/html/body/button")).click();

	}

}
