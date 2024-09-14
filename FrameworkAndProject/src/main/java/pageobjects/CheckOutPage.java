package pageobjects;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckOutPage extends ReusableComponents {
	WebDriver driver;

	//driver intitialization
	public  CheckOutPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css=".action__submit")
	WebElement submit;
	
	@FindBy(xpath="//button[@type='button'][2]")
	WebElement selectCountry;
	
	
	@FindBy(css="[placeholder='Select Country']")
	WebElement country;
	
	By results=By.cssSelector(".ta-results");
	
	public void selectCountry(String countryName) {
		Actions a = new Actions(driver);
		a.sendKeys(country,countryName).build().perform();
		waitElementsTOAppear(By.cssSelector(".ta-results"));
		selectCountry.click();

		
	}
	
	
	public ConfirmationPage submitOrder() {
		submit.click();
		return new ConfirmationPage(driver);
	}
}
