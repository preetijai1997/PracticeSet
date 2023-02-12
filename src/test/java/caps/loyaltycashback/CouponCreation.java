package caps.loyaltycashback;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CouponCreation {
	
	public static WebDriver driver;
public static Properties file() throws IOException
{
	Properties p= new Properties();
	FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config.properties");
	p.load(fi);
	
	return p;
	
}
	public static void main(String[] args) throws IOException, InterruptedException {
		driver= new ChromeDriver();
				
			
		Properties p=file();
				//System.out.println(System.getProperty("user.dir"));
				driver.get(p.getProperty("url"));

				driver.manage().window().maximize();
				driver.switchTo().frame("Main");
				driver.findElement(By.xpath(p.getProperty("usernameTextBox"))).sendKeys(p.getProperty("uasername"));
				driver.findElement(By.xpath(p.getProperty("passwordTextBox"))).sendKeys(p.getProperty("password"));
				driver.findElement(By.xpath(p.getProperty("loginBtn"))).click();
				
//				ControlPanel c= new ControlPanel(driver);
//		c.main1();
		
		Thread.sleep(4000);
		CouponStatus sc= new CouponStatus(driver);
		sc.status();
		
		CouponPage coup= new CouponPage(driver);
		Thread.sleep(3000);
		coup.loginDetails();
		
		
		
				
				
			}
}
