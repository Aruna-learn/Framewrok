package Automation.FrameworkAndProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AddingItemsIntoCart {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		List <WebElement> list = driver.findElements(By.xpath("//h4[@class='product-name']"));
		
		for(int i=0;i<list.size();i++)
		{
			
			String name=list.get(i).getText();
			
			//System.out.println(name);
			
			if(name.contains("Cucumber"))
			{
				 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
