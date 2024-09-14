package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnableDisable {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();

		System.out.println(driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).isSelected());

		driver.findElement(By.name("ctl00$mainContent$rbtnl_Trip")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		//based on style its enabled and diabled
	}

}
