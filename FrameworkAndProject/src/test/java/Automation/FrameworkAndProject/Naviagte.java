package Automation.FrameworkAndProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagte {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.navigate().to("https:www.flipkart.com");
		System.out.println(driver.getTitle());
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().to("https://www.amazon.com");
		System.out.println(driver.getTitle());
		driver.navigate().forward();

	}

}
