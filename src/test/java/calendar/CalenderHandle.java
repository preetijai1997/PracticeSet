package calendar;

import java.time.Duration;
import java.util.Calendar;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CalenderHandle {
	
	static int currentDay=0,
			currentMonth=0,
			currentYear=0;
	
	static int targetDay=0,
			targetMonth=0,
			targetYear=0;
	
	static int jumpMonth=0;
	
	static int jumpDate=0;
	static boolean increment= true;

	public static void main(String[] args) {
		
		String dateToSet="11/11/2023";
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/datepicker/#date-range");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		driver.findElement(By.xpath("//input[@id='from']")).click();
		Select s= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		s.selectByValue(Integer.toString(jumpMonth));
		
		
		
		getCurrentDayMonthAndYear();
		System.out.println("Current Day " + currentDay+ " "+"Current Month "+" "+ currentMonth+ "Current Year " + " "+currentYear);
		
		getTargetDayMonthAndYear(dateToSet);
		System.out.println("Target Day" + targetDay+ " "+"Target Month"+" "+ targetMonth+ "Target Year" + " "+targetYear);
		
		MonthJump();
		System.out.println(jumpMonth);
		System.out.println(increment);
		
		DateJump();
		System.out.println(jumpDate);
		
	}
	
	public static void getCurrentDayMonthAndYear() {
		
		Calendar cal= Calendar.getInstance();
		
		currentDay=cal.get(Calendar.DAY_OF_MONTH);
		currentMonth=cal.get(Calendar.MONTH)+1;
		currentYear=cal.get(Calendar.YEAR);
		
	}
	
	public static void getTargetDayMonthAndYear(String dateString)
	{
		 
		int firstIndex=dateString.indexOf("/");
		int lastIndex= dateString.lastIndexOf("/");
		
		String day= dateString.substring(0,firstIndex);
		targetDay=Integer.parseInt(day);
		
		String month=dateString.substring(firstIndex+1, lastIndex);
		targetMonth=Integer.parseInt(month);
		
		String year= dateString.substring(lastIndex+1, dateString.length());
		targetYear=Integer.parseInt(year);
		}
	
	public static void MonthJump()
	{
		if((targetMonth-currentMonth)>0)
		{
			jumpMonth=(targetMonth-currentMonth);
		}
		else
		{
			jumpMonth=(currentMonth-targetMonth);
			
			increment=false;
		}
	}
	
	public static void DateJump()
	{
		if((targetDay-currentDay)>0)
		{
			jumpDate=(targetDay-currentDay);
		}
		else
		{
			jumpDate=(currentDay-targetDay);
			
			increment=false;
		}
	}
}
