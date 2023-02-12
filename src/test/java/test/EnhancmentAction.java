package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class EnhancmentAction {

	public static void main(String[] args) {

    WebDriver driver= new ChromeDriver();
    
    driver.get("https://www.google.com");
    
    WebElement link=driver.findElement(By.linkText("Gmail"));
    int x=link.getRect().getX();
    int y=link.getRect().getY();
    
    Actions ac= new Actions(driver);
    ac.moveByOffset(x, y).click().perform();
    
	}

}
