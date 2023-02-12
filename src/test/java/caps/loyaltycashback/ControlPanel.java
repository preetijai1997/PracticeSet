package caps.loyaltycashback;

import java.util.List;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.*;

public class ControlPanel extends CouponCreation {
	public static Properties p;
	static WebDriver driver;

	public ControlPanel(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public ControlPanel() {
		// TODO Auto-generated constructor stub
	}

	public static void main1() throws IOException, InterruptedException {
		ControlPanel cp = new ControlPanel();
		p = cp.file();
		// System.out.println("Driver is "+ driver);
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("listOfNavBar")));
		List<WebElement> controlPanelList = driver.findElements(By.xpath(p.getProperty("listofControlPanelt")));
		List<WebElement> skuList=driver.findElements(By.xpath(p.getProperty("listofSKUManagement")));
		getList(list,"Control Panel");
		getList(controlPanelList,"SKU Management");
		getList(skuList,"Coupon Management");
	
		
		Thread.sleep(4000);
		driver.findElement(By.xpath(p.getProperty("firstCheckBox"))).click();
		
		driver.findElement(By.xpath(p.getProperty("firstOfferName"))).sendKeys(p.getProperty("offerName"));
		
		driver.findElement(By.xpath(p.getProperty("cashBackAmt"))).sendKeys(p.getProperty("cashAmt"));
		
        WebElement activationDate =driver.findElement(By.xpath(p.getProperty("ActivationDate")));
      
      
      
      activationDate.sendKeys(p.getProperty("activateDate"));
      
      activationDate.sendKeys(Keys.TAB);
      
     WebElement expiryDateField= driver.findElement(By.xpath(p.getProperty("expiryDateBox")));
     
     expiryDateField.sendKeys(p.getProperty("expiryDate"));
     
     expiryDateField.sendKeys(Keys.TAB);
     
    driver.findElement(By.xpath(p.getProperty("chooseInitials"))).sendKeys(p.getProperty("InitialName"));
    
    
       
      // selectMainService();
       
       uploadFile();
    
       Thread.sleep(2000);
       
       driver.findElement(By.xpath(p.getProperty("sendOTPBtn"))).click();
       
       Thread.sleep(9000);
       Alert alert = driver.switchTo().alert();
       alert.accept();
       Thread.sleep(9000);
       driver.findElement(By.xpath(p.getProperty("OTP"))).click();
       Thread.sleep(3000);
       driver.findElement(By.xpath(p.getProperty("verifyOTPBtn"))).click();
       
       System.out.println(driver.findElement(By.xpath(p.getProperty("successMessage"))).getText());

	}

	public static void getList(List<WebElement> li,String control) throws InterruptedException {
	
		for (int i = 0; i < li.size(); i++) {
			
			
			if (li.get(i).getText().equals(control)) {
				li.get(i).click();
				Thread.sleep(3000);
				break;

			}
		}
	}

	public static void selectMainService()
	{
		Select s= new Select(driver.findElement(By.xpath(p.getProperty("mainService"))));
		s.selectByValue("all");
		
	}
	

	public static void uploadFile() throws IOException, InterruptedException
	
	{
		Actions a= new Actions(driver);
		WebElement ele=driver.findElement(By.xpath(p.getProperty("clickOnChooseBtn")));
		a.moveToElement(ele).click().perform();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("C:\\Users\\bs0452\\Downloads\\FileUpload.exe");
	}
	
}
