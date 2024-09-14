package Automation.FrameworkAndProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("name")).sendKeys("Arun");
		driver.findElement(By.name("email")).sendKeys("abcd@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("Ammu@46");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticdropdown=driver.findElement(By.id("exampleFormControlSelect1"));

		Select sel=new Select(staticdropdown);
		sel.selectByVisibleText("Female");
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("22-08-1999");
		driver.findElement(By.cssSelector("[value='Submit']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText());
		
		
	}

}
