package Automation.FrameworkAndProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.asserts.Assertion;

public class BrowserInvoke {

	public static void main(String[] args) {
//		WebDriver driver=new ChromeDriver();
//        driver.get("https://rahulshettyacademy.com");
//		driver.manage().window().maximize();
//		System.out.println("application opened successfully");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		
		//edge
//		WebDriver driver=new EdgeDriver();
//        driver.get("https://rahulshettyacademy.com");
//		driver.manage().window().maximize();
//		System.out.println("application opened successfully");
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		
		
		//firefox
		WebDriver driver=new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		System.out.println("application opened successfully");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getPageSource());
		
		Assert.assertEquals(driver.getTitle(), "Selenium, API Testing, Software Testing & More QA Tutorials | Rahul Shetty Academy");
	}

	

}
