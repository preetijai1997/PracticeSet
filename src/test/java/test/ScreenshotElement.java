package test;

import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class ScreenshotElement {

	public static void main(String[] args) throws IOException {
		

		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.way2automation.com/way2auto_jquery/index.php");
		
		WebElement rightOf=driver.findElement(with(By.name("name")).toRightOf(By.tagName("label")));
		rightOf.sendKeys("Preeti Jaiswal");
		File f=rightOf.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File ("./ScreenShot/rightOf.png"));
		
		WebElement above=driver.findElement(with(By.name("email")).above(By.name("country")));
		above.sendKeys("preeti.jaiswal@bankit.in");
		File f1= above.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File ("./ScreenShot/above.png"));

	}

}
