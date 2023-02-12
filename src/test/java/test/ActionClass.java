package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class ActionClass {

	public static void main(String[] args)
	{
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://jqueryui.com/resources/demos/slider/default.html");
		
	   WebElement sliderIcon=	driver.findElement(By.xpath("//span[contains(@class,'ui-slider-handle')]"));
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	   
	   WebElement mainSlider=driver.findElement(By.id("slider"));
	   int width=mainSlider.getSize().width/2;
	   
	   new Actions(driver).dragAndDropBy(sliderIcon,width , 0).perform();
	}

}
