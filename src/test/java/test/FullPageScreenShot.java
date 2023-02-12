package test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FullPageScreenShot {

	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.way2automation.com/");
		
		if(driver instanceof FirefoxDriver)
		{
			File fullPage=((FirefoxDriver) driver).getFullPageScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(fullPage, new File("./ScreenShot/fullPage.jpg"));
		}
		
		else if(driver instanceof ChromeDriver)
		{
			File screenShot=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(screenShot, new File("./ScreenShot/screenshot.jpg"));
		}

	}

}
