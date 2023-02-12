package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://deluxe-menu.com/popup-mode-sample.html");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		WebElement img= driver.findElement(By.xpath("//img[@src='data-samples/images/popup_pic.gif']"));
		
		Actions ac= new Actions(driver);
		ac.contextClick(img).perform();
		
		WebElement productInfo=driver.findElement(By.xpath("//td[text()='Product Info']"));
		ac.moveToElement(productInfo).perform();
		
		WebElement instal= driver.findElement(By.xpath("//td[text()='Installation']"));
		ac.moveToElement(instal).perform();
		
		
		WebElement howToDownload= driver.findElement(By.xpath("//td[text()='How To Setup']"));
		ac.moveToElement(howToDownload).click().perform();
		//System.out.println(driver.getTitle());
		
		
	
	
	}

}
