package test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.PrintsPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.print.PrintOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.nio.file.Files;

public class PrintingPdf {

	public static void main(String[] args) throws IOException {
		
		ChromeOptions opt= new ChromeOptions();
		opt.addArguments("headless");
		
		
		
		WebDriver driver= new ChromeDriver(opt);
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.manage().window().maximize();
		
		driver.get("https://portal.bankit.in:9090/RO/");
		
		driver.switchTo().frame("Main");
		
		driver.findElement(By.name("userName")).sendKeys("8957181611");
		
		driver.findElement(By.id("password")).sendKeys("119705");
		
		driver.findElement(By.id("login")).click();
		
		
		driver.findElement(By.xpath("//div[@id='popup']/div/div/button/span")).click();
		
     	Pdf pdf	=((PrintsPage) driver).print(new PrintOptions());
     	
     	Files.write(Paths.get("./BankitHomePage.pdf"), OutputType.BYTES.convertFromBase64Png(pdf.getContent()));
		
     	driver.switchTo().newWindow(WindowType.TAB);
     	driver.get("https://selenium.dev/");

Pdf pdf1	=((PrintsPage) driver).print(new PrintOptions());
     	
     	Files.write(Paths.get("./Selenium.pdf"), OutputType.BYTES.convertFromBase64Png(pdf1.getContent()));
	}

}
