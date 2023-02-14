package screenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	
	static WebDriver driver;
	
	public static void captureScreenShot() throws IOException
	{
		Date d= new Date();
		String fileName = d.toString().replace(":", "_").replace(" ", "_")+".jpg";
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File(".\\ScreenShot"+fileName));
		
	}

	public static void main(String[] args) throws IOException {
		
		
		driver= new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		driver.get("https://www.selenium.dev/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		captureScreenShot();
	}

}
