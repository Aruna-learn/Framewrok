package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetHeightAndWidthOfElement {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
	
		WebElement sc=	driver.findElement(By.name("name"));
		System.out.println(sc.getRect().getDimension().getHeight());
		System.out.println(sc.getRect().getDimension().getWidth());
		
		System.out.println(sc.getRect().getHeight());
		System.out.println(sc.getRect().getWidth());
		System.out.println(sc.getRect().getX());
		System.out.println(sc.getRect().getY());
		
		System.out.println(sc.getLocation().x);
		System.out.println(sc.getRect().y);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
