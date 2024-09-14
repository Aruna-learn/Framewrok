package Automation.FrameworkAndProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompleteDropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		WebElement searchbox=driver.findElement(By.id("autocomplete"));
		searchbox.clear();
		Thread.sleep(3000);
		
		searchbox.sendKeys("an");
		Thread.sleep(3000);
		String text;//store text in string
		
		do {
			
			searchbox.sendKeys(Keys.ARROW_DOWN);
			text=searchbox.getAttribute("value");
			if(text.equals("Andorra"))
			{
				
				Thread.sleep(3000);
				searchbox.sendKeys(Keys.ENTER);//if the text equal click on enter
				break;
			}
			Thread.sleep(3000);
		} while (!text.isEmpty());
		
		
		
		
		
		
		
		
		
	}

}
