package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends ReusableComponents {
	WebDriver driver;

	//driver intitialization
	public  ConfirmationPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	@FindBy(css=".hero-primary")
	WebElement Confirmationmessage;
	
	
	public   String VerifyConfirmationMessage() {
		return Confirmationmessage.getText();
	}
	
	
	
	
	
	
	
	
	
	
	
}
