package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		
		WebElement drag= driver.findElement(By.id("draggable"));
		WebElement drop= driver.findElement(By.id("droppable"));
		
		Actions ac= new Actions(driver);
		//ac.dragAndDrop(drag, drop).perform();
		ac.dragAndDropBy(drag, 200, 400).perform();
		
	}

}
