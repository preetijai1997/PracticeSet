package caps.loyaltycashback;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.support.PageFactory;

import caps.loyaltycashback.CouponCreation;

public class CouponPage extends CouponStatus{
	public static Properties p;
	static WebDriver driver;
	
	
	public CouponPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}
	
	public CouponPage()
	{
		
	}
public void loginDetails() throws InterruptedException, IOException
{
	CouponPage c= new CouponPage();
	p=c.file();
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get(p.getProperty("urlROPortal"));
	driver.switchTo().frame("Main");
	driver.findElement(By.xpath(p.getProperty("userNameTextBox1"))).sendKeys(p.getProperty("userName"));
	driver.findElement(By.xpath(p.getProperty("passwordTextBox1"))).sendKeys(p.getProperty("pin"));
	driver.findElement(By.xpath(p.getProperty("loginButton"))).click();
	Thread.sleep(7000);
	driver.findElement(By.xpath(p.getProperty("popupCross"))).click();
	coupon();
	
}
	public static void coupon() throws IOException, InterruptedException
	{
	
		driver.findElement(By.xpath(p.getProperty("couponImg"))).click();
		driver.findElement(By.xpath(p.getProperty("mobileNum"))).sendKeys(p.getProperty("Num"));
		driver.findElement(By.xpath(p.getProperty("submitBtn"))).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath(p.getProperty("couponCodeTextBox"))).sendKeys(p.getProperty("couponCode"));
		driver.findElement(By.xpath(p.getProperty("submitBtn"))).click();
	}

}
