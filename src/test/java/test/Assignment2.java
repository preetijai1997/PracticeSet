package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.time.Duration;

public class Assignment2 {

	public static void main(String[] args) {
WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://way2automation.com/way2auto_jquery/index.php");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Preeto Jaiswal");
		
		WebElement btn=driver.findElement(with(By.tagName("input")).toRightOf(By.linkText("Signin")));
		btn.click();
		

	}

}
