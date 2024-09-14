package Automation.FrameworkAndProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EndToEndUIElements {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//auto suggestion dropdown
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


		//radio button for one way trip
		//driver.findElement(By.id("ctl00$mainContent$rbtnl_Trip")).click();

		
		//dynamic dropdown
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@text='Bengaluru (BLR)']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@value='JAI'])[2]")).click();
		
		//date selecting
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		
		
		//checkboxes
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).click();
		System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily")).isSelected());

		//count number of checkboxes
		System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());

		//updated dropdown
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

		//static dropdown
		WebElement staticdropdown=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));

		Select sel=new Select(staticdropdown);
		sel.selectByIndex(1);
		System.out.println(sel.getFirstSelectedOption().getText());
		sel.selectByValue("AED");

		//search button
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		System.out.println("unfortunately flight not available on the selected date");




	}

}
