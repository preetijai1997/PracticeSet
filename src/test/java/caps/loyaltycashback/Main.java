package caps.loyaltycashback;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) throws IOException {
WebDriver driver= new ChromeDriver();
		
		Properties p= new Properties();
		FileInputStream fi= new FileInputStream(System.getProperty("user.dir")+"\\src\\test\\java\\config.properties");
		p.load(fi);
		
		//System.out.println(System.getProperty("user.dir"));
		driver.get(p.getProperty("url"));

		driver.manage().window().maximize();
		driver.switchTo().frame("Main");
		driver.findElement(By.xpath(p.getProperty("usernameTextBox"))).sendKeys(p.getProperty("uasername"));
		driver.findElement(By.xpath(p.getProperty("passwordTextBox"))).sendKeys(p.getProperty("password"));
		driver.findElement(By.xpath(p.getProperty("loginBtn"))).click();
		
		
		
		
	}

}
