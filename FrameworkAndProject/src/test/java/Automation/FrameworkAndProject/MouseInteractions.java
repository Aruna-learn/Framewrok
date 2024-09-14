package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseInteractions {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		
		//mouse hover
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).perform();
		Thread.sleep(4000);
		
		//enter the data with caps
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("Aruna").perform();
		Thread.sleep(4000);
		
		//double click
		act.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("Aruna").doubleClick().perform();
		Thread.sleep(4000);
		
		//rightclick
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Account & Lists']"))).contextClick().perform();
		
		
		
	}

}
