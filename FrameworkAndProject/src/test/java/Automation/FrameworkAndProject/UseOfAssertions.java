package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class UseOfAssertions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		Assert.assertTrue	(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());
		driver.findElement(By.id("divpaxinfo")).click();
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
		Thread.sleep(3000);
		for(int i=0;i<=2;i++) {
			driver.findElement(By.id("hrefIncInf")).click();
		}
		Thread.sleep(3000);
		driver.findElement(By.id("btnclosepaxoption")).click();	
		Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(),"2 Infant");
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());



	}

}
