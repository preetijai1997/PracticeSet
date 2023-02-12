package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {

	public static void main(String[] args) {
	
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/resources/demos/resizable/default.html");
        WebElement icon=driver.findElement(By.xpath("//div[contains(@class,'ui-icon-gripsmall-diagonal-se')]"));
        
        new Actions(driver).dragAndDropBy(icon, 300, 270).perform();
	}

}
