package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment6 {

	public static void main(String[] args) {
		
		ChromeOptions chrome= new ChromeOptions();
		chrome.addArguments("window-size=300,400");
		
		//chrome.addArguments("window-size=600,700");
		
		WebDriver driver= new ChromeDriver(chrome);
		
		driver.get("https://www.google.com");
		
		
	}

}
