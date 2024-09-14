package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("inputUsername")).sendKeys("arunaammu9922@gmail.com");	
		driver.findElement(By.name("inputPassword")).sendKeys("Ammu@460");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//div/form/input[1]/following-sibling::input
		//input/parent::form
		//input/parent::form/parent::div
		
		
		
		

	}

}
