package Automation.FrameworkAndProject;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialWebElementScreenshot {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		//multitasking paralley runs many browsers
		driver.switchTo().newWindow(WindowType.WINDOW);


		Set<String> handles=driver.getWindowHandles();
		Iterator<String>it=handles.iterator();
		String parent=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		driver.get("https://rahulshettyacademy.com/");

		String course=driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();

		driver.switchTo().window(parent);

		WebElement sc=	driver.findElement(By.name("name"));
		sc.sendKeys(course);

		File f=sc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("logo.png"));
		System.out.println("screenshotssaved successfully");


















	}

}
