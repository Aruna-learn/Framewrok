package Automation.FrameworkAndProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ScrollingWebPages {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//to scroll the window
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(4000); 

		// to scroll the table in the webpage
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=500");

		List<WebElement> list=	driver.findElements(By.xpath("//*[@id=\"product\"]/tbody/tr/td[4]"));
		int sum=0;

		for(int i=0;i<list.size();i++) {
			sum=sum+Integer.parseInt(list.get(i).getText());
		}
		System.out.println(sum);
		driver.findElement(By.cssSelector(".totalAmount")).getText();
		int total=Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim());
		
		Assert.assertEquals(sum, total);
		
		
		
		
		
		
		
	}

}
