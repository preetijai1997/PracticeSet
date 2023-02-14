package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class AshotAPIScreenshot {
  static WebDriver driver;
	
	public static void fullPageScreenShot() throws IOException
	{
		
		Date d= new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
          Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);
		
		ImageIO.write(screenshot.getImage(), "jpg",  new File (".\\ScreenShot"+fileName));

	}
	
	public static void ParticularSectionScreenShot(WebElement ele) throws IOException
	{
		Date d= new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
          Screenshot screenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver,ele);
		
		ImageIO.write(screenshot.getImage(), "jpg",  new File (".\\ScreenShot"+fileName));

	}

	public static void main(String[] args) throws IOException {
		
		
		 driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		
		WebElement ele=driver.findElement(By.xpath("//h2[text()='Selenium Level Sponsors']"));
		
		//fullPageScreenShot();
		
		ParticularSectionScreenShot(ele);
		
		
	}

}
