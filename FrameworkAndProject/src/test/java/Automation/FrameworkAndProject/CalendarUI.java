package Automation.FrameworkAndProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CalendarUI {

	public static void main(String[] args) throws Throwable {
		
		String month="7";
		String date="22";
		String year="2028";
		String[] expectedList = {month,date,year};
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector(".react-calendar__navigation__label")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='"+year+"']")).click();
		Thread.sleep(3000);
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)-1).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//abbr[text()='"+date+"']")).click();
		Thread.sleep(3000);
		
		
		List<WebElement> actualList = driver.findElements(By.cssSelector(".react-date-picker__inputGroup__input"));

		for(int i =0; i<actualList.size();i++)

		{

		System.out.println(actualList.get(i).getAttribute("value"));

		Assert.assertEquals(actualList.get(i).getAttribute("value"), expectedList[i]);

		}

		driver.close();
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
