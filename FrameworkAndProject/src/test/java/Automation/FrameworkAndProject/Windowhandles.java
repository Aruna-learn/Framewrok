package Automation.FrameworkAndProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandles {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().window().maximize();
		driver.findElement(By.tagName("a")).click();
		Set<String> windows=driver.getWindowHandles();
		System.out.println(windows);
		Iterator<String> it=windows.iterator();
		String parent=it.next();
		System.out.println(parent.toString());
		String child=it.next();
		System.out.println(child.toString());
		driver.switchTo().window(child);
		System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());

		//get the below code in the debug mode watch later
		String emailid=	driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
		driver.switchTo().window(parent);
		driver.findElement(By.name("username")).sendKeys(emailid);


	}

}
