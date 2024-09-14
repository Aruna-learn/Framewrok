package pageobjects;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	WebDriver driver;

	//driver intitialization
	public  CartPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css=".totalRow button")
	WebElement checkoutelement;
	
	@FindBy(css=".cartSection h3")
	List<WebElement> cartProducts;

	public Boolean verifyProductDisplay(String productName) {
		Boolean match = cartProducts.stream().anyMatch(cartProduct-> cartProduct.getText().equalsIgnoreCase(productName));
		return match;

		
	}
	
	public CheckOutPage gotToCheckout() {
		checkoutelement.click();
		return new CheckOutPage(driver);
	}
	
	
	
	
	
	
	
	
	
}
