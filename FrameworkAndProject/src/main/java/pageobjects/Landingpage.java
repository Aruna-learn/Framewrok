package pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Landingpage extends ReusableComponents {


	WebDriver driver;

	
	//driver initialization
	public  Landingpage(WebDriver driver) {
		super(driver);//sending variable from child class to super class
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//page objects
//	WebElement useremail=driver.findElement(By.id("userEmail"));
//	WebElement userpassw=driver.findElement(By.id("userPassword"));
//	WebElement submit=driver.findElement(By.id("login"));

//we can update page objects into page factory
	@FindBy(id="userEmail")
	WebElement useremail;

	@FindBy(id="userPassword")
	WebElement userPassword;
	
	@FindBy(id="login")
	WebElement submit;
	
	@FindBy(css="[class*='flyInOut']")
	WebElement errorMessage;

public ProductCatalogue loginApplication(String username, String usePassword) {
	useremail.sendKeys(username);
	userPassword.sendKeys(usePassword);
	submit.click();
	ProductCatalogue productCatalogue = new ProductCatalogue(driver);
	return productCatalogue;
	
}
public String getErrorMessage()
{
	waitForWebElementToAppear(errorMessage);
	return errorMessage.getText();
}
 public void goTo() {
	 driver.get("https://rahulshettyacademy.com/client/");
 }


}
