package Automation.FrameworkAndProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentDynamicValues {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.id("checkBoxOption2")).click();
		String opttext=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();
		WebElement dropdown=driver.findElement(By.id("dropdown-class-example"));
		Select sel=new Select(dropdown);
		sel.selectByVisibleText("Option2");
		driver.findElement(By.id("name")).sendKeys(opttext);
		driver.findElement(By.id("alertbtn")).click();
		String alertmsg=driver.switchTo().alert().getText();
		System.out.println(driver.switchTo().alert().getText());
		
		if(alertmsg.contains(opttext))

	     {

	    System.out.println(" Same text:success");

	     }

	     else

	    System.out.println("text mismatched");

	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
