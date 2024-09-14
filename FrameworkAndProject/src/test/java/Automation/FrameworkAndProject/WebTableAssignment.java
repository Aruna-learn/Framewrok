package Automation.FrameworkAndProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableAssignment {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//to scroll the window
		js.executeScript("window.scrollBy(0,600)");

		Thread.sleep(4000); 
		
		//no of rows in table
		
		List<WebElement> rows=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr"));
		System.out.println("No of rows in the table is:"+rows.size());
		
		for(int i=0;i<rows.size();i++) {
			System.out.println("rowdata:"+rows.get(i).getText());
			
		}
		//2nd row data
		for(int i=2;i<rows.size();i++) {
			System.out.println("Second row data of  the table is:"+rows.get(i).getText());
			break;
			
		}
		
		System.out.println("-----------------------------------------------------------");
		
		//No of columns in the table
		List<WebElement> columns=driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr/th"));
		System.out.println("No of columns in the table is:"+columns.size());
		
		for(int i=0;i<columns.size();i++) {
			System.out.println(columns.get(i).getText());
		}
		
		
//		WebElement table=driver.findElement(By.id("product"));
//
//
//
//		System.out.println(table.findElements(By.tagName("tr")).size());
//
//
//
//		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
//
//
//
//		List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
//
//
//
//		System.out.println(secondrow.get(0).getText());
//
//
//
//		System.out.println(secondrow.get(1).getText());
//
//
//
//		System.out.println(secondrow.get(2).getText());
//
//		}
//
//		}
//		
//		
//		
		
		
		
		
		
		

	}

}
