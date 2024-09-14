package frameworkdesign;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageobjects.BaseTest;
import pageobjects.CartPage;
import pageobjects.ProductCatalogue;
import pageobjects.ReusableComponents;

public class ErrorValidationsTest extends BaseTest {

	

	@Test(groups={"ErrorHandling"},retryAnalyzer=Retry.class)
	public void LoginErrorValidation() throws IOException, InterruptedException {

	
		loginp.loginApplication("arunammu9922@gmail.com", "Ammu@460");
		Assert.assertEquals("Incorrect email or password.", loginp.getErrorMessage());

	}
	

	@Test
	public void ProductErrorValidation() throws IOException, InterruptedException
	{

		String productName = "ZARA COAT 3";
		ProductCatalogue productCatalogue = loginp.loginApplication("arunaammu9922@gmail.com", "Ammu@460");
		List<WebElement> products = productCatalogue.getProductslist();
		productCatalogue.addToCart(productName);
		CartPage cartPage = productCatalogue.goToCartPage();
		Boolean match = cartPage.verifyProductDisplay("ZARA COAT 33");
		Assert.assertFalse(match);
		
	
	}
	}