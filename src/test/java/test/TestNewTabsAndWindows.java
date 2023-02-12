package test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestNewTabsAndWindows {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://portal.bankit.in:9090/RO/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://portal.bankit.in:9090/CAPS/");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://portal.bankit.in:9090/DS/");
		
		
		System.out.println(driver.getWindowHandles().size());
		
		
	Set<String> window=	driver.getWindowHandles();
	
	Iterator<String> it=window.iterator();
	
	List<String> windIndex= new ArrayList<String>();
	while(it.hasNext())
	{
		windIndex.add(it.next());
	}
	
	driver.switchTo().window(windIndex.get(0));
	System.out.println("First window title is "+driver.getTitle());
	driver.close();
	
	driver.switchTo().window(windIndex.get(1));
	System.out.println("Second window title is "+driver.getTitle());
	driver.close();
	
	driver.switchTo().window(windIndex.get(2));
	System.out.println("Third window title is "+driver.getTitle());
	driver.close();
	}

}
