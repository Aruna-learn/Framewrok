package Automation.FrameworkAndProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWindowHnadle {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/a")).click();
		
		Set<String> windows=driver.getWindowHandles();
		
		Iterator<String>it =windows.iterator();
		
		String Parentid=it.next();
		System.out.println(Parentid);
		
		String ChildId=it.next();
		System.out.println(ChildId);
		
		
		driver.switchTo().window(ChildId);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());//New Window
		
		driver.switchTo().window(Parentid);
		System.out.println(driver.findElement(By.xpath("//h3")).getText());//Opening a new window
		
		
		
		
		
		
		
		

	}

}
