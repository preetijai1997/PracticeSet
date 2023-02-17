package listener;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.mysql.cj.jdbc.Driver;


public class testlistener {

	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {

		WebDriver webdriver = new ChromeDriver();
		
		
		 EventFiringWebDriver driver= new EventFiringWebDriver(webdriver);
		
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		 weblistener listener= new weblistener();
		 driver.register(listener);
		driver.navigate().to("https://www.google.com");
		
	    driver.findElement(By.xpath("//a[text()='Business']")).click();
	    
	    driver.navigate().back();
	    
	    driver.findElement(By.xpath("(//input[@name='btnK'])[2]")).click();
	    
	    driver.navigate().forward();
	    
	    driver.navigate().back();
	    
	   WebElement ele= driver.findElement(By.xpath("//a[text()='Gmail']"));
	   
	   System.out.println(ele.getText());
		
	   driver.switchTo().newWindow(WindowType.TAB);
	   
	   driver.get("https://red.bankit.in/RO2/");
		
		
	}

}
