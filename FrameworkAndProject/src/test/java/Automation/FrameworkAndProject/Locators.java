package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;



public class Locators {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		System.out.println("application opened successfully");
		
		driver.findElement(By.className("theme-btn")).click();
		driver.findElement(By.name("sign_up_method")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Poololla Aruna");
		driver.findElement(By.cssSelector("input[id='user_email']")).sendKeys("abc@gmail.com");
		driver.findElement(By.id("password")).sendKeys("Ammu@460");
		driver.findElement(By.name("commit")).click();
		System.out.println(driver.findElement(By.linkText("Log in")).getText());
		//System.out.println(driver.findElement(By.partialLinkText("account")).getText());
		System.out.println(driver.findElement(By.tagName("a")).getAttribute("href"));
		System.out.println(driver.findElement(By.tagName("a")).getText());
	
		Assert.assertEquals(driver.findElement(By.tagName("a")).getText(), "Lo in");
		//Assert.assertEquals(driver.findElement(By.tagName("a")).getText(), "Log in");
		
		
		
		
		

	}

}
