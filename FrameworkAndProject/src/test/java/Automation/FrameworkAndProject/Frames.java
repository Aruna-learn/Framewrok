package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);//we ca yuse the frame with index starts with 0 and use the  framename and use the webelement
		//driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo=free]")));
		
		
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		
		WebElement drag=driver.findElement(By.id("draggable"));

		
		WebElement drop=driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Selectable']")).click();
		
		
		
		
		
		
		
	}

}
