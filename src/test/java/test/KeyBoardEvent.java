package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class KeyBoardEvent {

	public static void main(String[] args) {
		
		ChromeOptions chrome= new ChromeOptions();
		chrome.addArguments("incognito");
		WebDriver driver= new ChromeDriver(chrome);
		driver.manage().window().maximize();
		driver.get("https://www.gmail.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.name("identifier")).sendKeys("preetijaiswal504@gmail.com");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]")).click();
		Actions a= new Actions(driver);
		
		a.sendKeys(Keys.chord(Keys.CONTROL+"a")).sendKeys(Keys.CONTROL+"c").build().perform();
		driver.findElement(By.name("identifier")).click();
		a.sendKeys(Keys.chord(Keys.CONTROL+"v"));
		

	}

}
