package test;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptAlert {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		//driver.switchTo().alert().accept();
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		Alert aler=wait.until(ExpectedConditions.alertIsPresent());
		aler.accept();
		
		

	}

}
