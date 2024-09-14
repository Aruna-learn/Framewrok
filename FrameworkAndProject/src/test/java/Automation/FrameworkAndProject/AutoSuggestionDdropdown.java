package Automation.FrameworkAndProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestionDdropdown {

	public static void main(String[] args) throws Throwable {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		System.out.println(driver.getTitle());
		driver.findElement(By.id("autosuggest")).sendKeys("an");
		Thread.sleep(3000);
		List<WebElement> alllist=driver.findElements(By.xpath("//li[@class='ui-menu-item']//a"));

		System.out.println("size of the list is:"+alllist.size());
		System.out.println("all lists is:"+alllist);

		for (WebElement option : alllist) {
			//String optiontext=option.getText();//for anchor tag we use get text method
			System.out.println(option.getText());

			if(option.getText().contains("Albania"))
			{
				option.click();
				break;
			}



		}











	}

}
