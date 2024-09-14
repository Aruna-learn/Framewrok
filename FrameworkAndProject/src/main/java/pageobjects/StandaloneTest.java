package pageobjects;

import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StandaloneTest  extends BaseTest{
	String productName="ZARA COAT 3";
	@Test(dataProvider="testing", groups={"Purchase"})
	public void submitordertest(HashMap<String,String> input) throws Throwable {


		ProductCatalogue Prc=loginp.loginApplication(input.get("username"), input.get("usePassword"));
		List<WebElement> produc=Prc.getProductslist();
		Prc.addToCart(input.get("productName"));

		Prc.goToCartPage();;

		CartPage Cp=new CartPage(driver);
		Boolean match=	Cp.verifyProductDisplay(input.get("productName"));
		Assert.assertTrue(match);
		Cp.gotToCheckout();
		CheckOutPage chp= new CheckOutPage(driver);

		chp.selectCountry("india");

		ConfirmationPage ConfirmationPage=chp.submitOrder();


		String confirmMessage = ConfirmationPage.VerifyConfirmationMessage();
		Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
		//driver.close();


	}
	@Test(dependsOnMethods= {"submitordertest"})
	public void OrderHistoryTest()
	{
		//"ZARA COAT 3";
		ProductCatalogue productCatalogue = loginp.loginApplication("arunaammu9922@gmail.com", "Ammu@460");
		OrderPage ordersPage = productCatalogue.goToOrdersPage();
		Assert.assertTrue(ordersPage.VerifyOrderDisplay(productName));

	}

//
//	 @DataProvider
//	  public Object[][] getData()
//	  {
//	    return new Object[][]  {{"arunaammu9922@gmail.com","Ammu@460","ZARA COAT 3"}, {"shetty@gmail.com","Iamking@000","ADIDAS ORIGINAL" } };
//	    
//	  }




//	 @DataProvider(name="testing")
//	  public Object[][] getData()
//	  {
//		 
//		 HashMap<String,String> map = new HashMap<String,String>();
//			map.put("username", "arunaammu9922@gmail.com");		
//			map.put("usePassword", "Ammu@460");
//			map.put("productName", "ZARA COAT 3");
//			
//			HashMap<String,String> map1 = new HashMap<String,String>();
//			map1.put("username", "shetty@gmail.com");
//			map1.put("usePassword", "Iamking@000");
//			map1.put("productName", "ADIDAS ORIGINAL");
//	    return new Object[][]  {{map}, {map1} };
//	    
//	  }


	 @DataProvider(name="testing")
		public Object[][] getData() throws IOException
		{

			
			List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"\\src\\test\\java\\frameworkdesign\\purchaseorder.json");
			return new Object[][]  {{data.get(0)}, {data.get(1) } };
			
		}

















}
