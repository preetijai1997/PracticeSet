package listener;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;


@SuppressWarnings("deprecation")
public class weblistener extends AbstractWebDriverEventListener {

	
	public void afterClickOn(WebElement element, WebDriver driver){
		
		System.out.println("Object clicked");
		
		
	}
	
	
	public void afterNavigateForward(WebDriver driver) {
		
		System.out.println("Moving forward");
		
	}
	
	public void beforeNavigateForward(WebDriver driver)
	{
		System.out.println("Before forward");
	}
	
	public void afterGetText(WebElement element, WebDriver driver, java.lang.String text)
	{
		System.out.println("Text is present");
	}
	
	public void beforeSwitchToWindow(java.lang.String windowName, WebDriver driver)
	{
		System.out.println("Switiching the window");
	}
	
	public  void afterSwitchToWindow(java.lang.String windowName, WebDriver driver)
	{
		System.out.println("Open new tab after swtich ");
		
	}
	
}

