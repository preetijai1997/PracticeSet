package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCasePractice {
	
	@BeforeTest
	public void createDBConn()
	{
		System.out.println("DB Connected");
	}
	
	@AfterTest
	public void closeDBConn()
	{
		System.out.println("DB Close");
	}
	
	@BeforeMethod
	public void browserOpen()
	{
		System.out.println("Successful browser is launch " );
	}
	
	@AfterMethod
	public void browserClose()
	{
		System.out.println("Successful browser is close " );
	}
	
	@Test
	public void doLogin()
	{
		System.out.println("Login SuccessFull");
	}
	
	@Test
	public void doLogout()
	{
		System.out.println("Logout successful");
	}
	
	@Test
	public void validateTitle()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://uat.bankit.in/RO/");
		String expectedTitle="BANKIT SERVICES PRIVATE LIMITED";
		String actualTitle=driver.getTitle();
		Assert.assertEquals(actualTitle, expectedTitle, "Validate SuccessFul");
	}
	
	
	
	

}
