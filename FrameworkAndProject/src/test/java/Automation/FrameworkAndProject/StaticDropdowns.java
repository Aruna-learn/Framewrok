package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {

	public static void main(String[] args) {
		
		//static dropdown means dropdown options are fixed
		WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select sel=new Select(staticdropdown);
		sel.selectByIndex(1);
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByValue("AED");
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByVisibleText("USD");
		System.out.println(sel.getFirstSelectedOption().getText());
		
		
		
		
		
		
		
		
	}

}
