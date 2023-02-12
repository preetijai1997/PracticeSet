package caps.loyaltycashback;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class CouponStatus extends ControlPanel {
	
	public static Properties p;
	static WebDriver driver;
	
	public CouponStatus(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver = driver;
	}

	public CouponStatus() {
		// TODO Auto-generated constructor stub
	}
	
	public static void status() throws InterruptedException, IOException
	{
		CouponStatus cs= new CouponStatus();
		p = cs.file();
		List<WebElement> list = driver.findElements(By.xpath(p.getProperty("listOfNavBar")));
		List<WebElement> controlPanelList = driver.findElements(By.xpath(p.getProperty("listofControlPanelt")));
		List<WebElement> skuList=driver.findElements(By.xpath(p.getProperty("listofSKUManagement")));
		getList(list,"Control Panel");
		getList(controlPanelList,"SKU Management");
		getList(skuList,"Coupon Status");
		List<WebElement> li=driver.findElements(By.xpath(p.getProperty("tableHeader")));
		
		List<WebElement> downLoad=driver.findElements(By.xpath(p.getProperty("downloadFile")));
		headerList(li,downLoad);
		readFile();
	}
	
	public static void headerList(List<WebElement> list,List<WebElement> down)
	{
		
		for(int i=0;i<list.size();i++)
		{
			
		     if(list.get(i).getText().equals("56"))
		     {
		    	 down.get(i).click();
		    	 break;	
		     }
		}
	}
	
	public static void readFile() throws IOException
	{
		File f= new File("C:\\Users\\bs0452\\Downloads\\LoyalityCashbackBatchStatus (81).xls");
		FileInputStream fis= new FileInputStream(f);
		
		HSSFWorkbook xsf= new HSSFWorkbook(fis);
		
		HSSFSheet sheet= xsf.getSheetAt(0);
		
		System.out.println("000000000000000000000000");
		
//	int row=	sheet.getRow(1).getRowNum();
//	System.out.println("Row is "+ row);
		
		String couponCode=sheet.getRow(2).getCell(4).getStringCellValue();
		
		System.out.println("Coupon code is ============" + couponCode);
		
	
	}


}
