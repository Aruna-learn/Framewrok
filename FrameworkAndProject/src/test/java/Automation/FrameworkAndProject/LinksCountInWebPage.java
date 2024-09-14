package Automation.FrameworkAndProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCountInWebPage {

	public static void main(String[] args) throws Throwable {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		//System.out.println(driver.getPageSource());

		//get count number of links in webpage
		System.out.println("total links in the webpage:"+driver.findElements(By.tagName("a")).size());


		//count the links in footer section only to do that limit the driver scope to foooter then take the links 

		WebElement scope=driver.findElement(By.id("gf-BIG"));
		System.out.println("links in the footer section:"+scope.findElements(By.tagName("a")).size());

		//count the links in the footer column
		WebElement columnlink=driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println("links in the footer column section:"+columnlink.findElements(By.tagName("a")).size());

		//click on the each link in the coulumn and check if page is opening or not in separate tab
		// click on the columnlink firstone and back (navigate)to page again click on second link its take time to solve this use the ctrl+click

		for(int i=0;i<columnlink.findElements(By.tagName("a")).size();i++){

			String clicklink=Keys.chord(Keys.CONTROL,Keys.ENTER);
			columnlink.findElements(By.tagName("a")).get(i).sendKeys(clicklink);
			Thread.sleep(3000);
		}

		//get title of child tabs

		Set<String> windows=driver.getWindowHandles();
		Iterator<String> it=windows.iterator();
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println("Titles of the webpage is:"+driver.getTitle());
		}





	}

}
