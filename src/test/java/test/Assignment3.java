package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://timesofindia.indiatimes.com/poll.cms");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		String question=driver.findElement(By.id("mathq2")).getText().trim();
		int sum=0;
		for( int i=0; i<question.length();i++)
		{
			char digit=question.charAt(i);
			if(Character.isDigit(digit))
			{
				sum= sum+Character.getNumericValue(digit);
			}
		}
		System.out.println("Sum is : "+ sum);
		driver.findElement(By.id("mathuserans2")).sendKeys(Integer.toString(sum));
			
		}
		
		/*
		System.out.println("Question is " + question );
		String removespace = question.replaceAll("\\s+", "");//6+0=10
		System.out.println(removespace+"Remove Space is");
		String[] parts = removespace.split("\\+");  
		System.out.println("Split is" +parts[0] +parts[1]);
		
		int part1=Integer.parseInt(parts[0]);
		int part2=Integer.parseInt(parts[1].split("\\=")[0]);
		
		int sum=part1+part2;
		
		System.out.println("Sum is : "+ sum);
		
		String summition= Integer.toString(sum);
		
           driver.findElement(By.id("mathuserans2")).sendKeys(summition);
		
	*/
	}


