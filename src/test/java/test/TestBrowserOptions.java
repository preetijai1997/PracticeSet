package test;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class TestBrowserOptions {
 
	public static void main(String[] args) throws InterruptedException {
 
 
		Map<String,String> mobileEm = new HashMap<String,String>();
		mobileEm.put("deviceName", "Samsung Galaxy S8+");
		
		ChromeOptions opt = new ChromeOptions();
		//opt.addArguments("--headless");
		opt.setAcceptInsecureCerts(true);
		//opt.addArguments("disable-infobars");
		//opt.addArguments("window-size=1400,1000");
		opt.addArguments("incognito");
		
		opt.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		opt.setExperimentalOption("mobileEmulation",mobileEm );
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(opt);
		driver.get("https://portal.bankit.in:9090/RO/");

		
		driver.switchTo().frame("Main");
		
		driver.findElement(By.name("userName")).sendKeys("8957181611");
		
		driver.findElement(By.id("password")).sendKeys("119705");
		
		driver.findElement(By.id("login")).click();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@id='popup']/div/div/button/span")).click();
		
		System.out.println(driver.getTitle());
		
		
		
	}
 
}