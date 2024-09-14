package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		WebElement namebox=driver.findElement(By.name("name"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(namebox)).getText());
		
		
		WebElement dob=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
		
		WebElement icecheck=driver.findElement(By.xpath("//label[@class='form-check-label']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(icecheck)).click();
		
		
		WebElement rd=driver.findElement(By.id("inlineRadio1"));
		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rd)).getText());
		
		
		
		
		
		
		
		
		

	}

}
