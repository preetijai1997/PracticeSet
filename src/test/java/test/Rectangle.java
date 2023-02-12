package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rectangle {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://portal.bankit.in:9090/RO/");
		
		driver.switchTo().frame("Main");
	WebElement BankitLogo=driver.findElement(By.xpath("//img[@src='https://portal.bankit.in:9090/Demo/wl/10002/images/logo.png']"));
	org.openqa.selenium.Rectangle rect=BankitLogo.getRect();
	
	System.out.println("Height of logo is : "+ rect.height);
	System.out.println("Width of logo is : "+ rect.width);
	System.out.println("X Cord of logo is : "+ rect.x);
	System.out.println("Y Cord of logo is : "+ rect.y);
	
	
	}

}
