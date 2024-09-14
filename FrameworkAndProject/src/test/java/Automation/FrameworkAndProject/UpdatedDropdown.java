package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000);
		for(int i=1;i<=2;i++) {
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		Thread.sleep(3000);
		for(int i=1;i<=2;i++) {
			driver.findElement(By.id("hrefIncChd")).click();
		}
		Thread.sleep(3000);
		for(int i=1;i<=2;i++) {
			driver.findElement(By.id("hrefIncInf")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.id("btnclosepaxoption")).click();	

		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



	}

}
