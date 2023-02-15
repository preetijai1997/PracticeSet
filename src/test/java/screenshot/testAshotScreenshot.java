package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class testAshotScreenshot {
	static WebDriver driver;
	public static void fullPageScreenShot() throws IOException
	{
		Date d= new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
          Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		ImageIO.write(screenshot.getImage(), "jpg",  new File (".\\ScreenShot"+fileName));
	}
	
	public static void eleScreenshot(WebElement ele) throws IOException
	{
		Date d= new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
          Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,ele);
		
		ImageIO.write(screenshot.getImage(), "jpg",  new File (".\\ScreenShot"+fileName));
	}

	public static void main(String[] args) throws IOException {
		
		
		 driver= new ChromeDriver();
		
		driver.get("https://red.bankit.in/RO2/");
		driver.manage().window().maximize();
		driver.switchTo().frame("Main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement userName=driver.findElement(By.name("userName"));
		System.out.println("000000000000000------username---------------000000000000000000");
		eleScreenshot(userName);
		userName.sendKeys("8957181611");

		WebElement password=driver.findElement(By.id("password"));
		System.out.println("000000000000000------pass---------------000000000000000000");
		eleScreenshot(password);
		password.sendKeys("119705");
	
		WebElement loginBtn=driver.findElement(By.id("login"));
		loginBtn.click();
		//eleScreenshot(loginBtn);
		
		driver.findElement(By.xpath("//div[@id='popup']/div/div/button/span")).click();
		
		System.out.println("000000000000000------fullPage---------------000000000000000000");
		fullPageScreenShot();
		

	}

}
