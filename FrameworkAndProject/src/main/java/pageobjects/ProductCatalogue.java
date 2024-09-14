package pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductCatalogue  extends ReusableComponents{


	WebDriver driver;

	//driver intitialization
	public  ProductCatalogue(WebDriver driver) {
		super(driver);//sending variable from child class to super class
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	//page objects
	//List<WebElement> list=driver.findElements(By.cssSelector(".mb-3"));


	@FindBy(css=".mb-3")
	List<WebElement> products;
	
	
	@FindBy(css=".ng-animating")
	WebElement spinner;

	By productsBy=	By.cssSelector(".mb-3");
	By AddtoCart=By.cssSelector(".card-body button:last-of-type");
	By toastMessage=By.cssSelector("#toast-container");
	
	
	
	public List<WebElement> getProductslist(){
		waitElementsTOAppear(productsBy);
		return products;
	}


	public WebElement getProductByName(String productName) {

		WebElement prod=products.stream().filter(lis->lis.findElement(By.cssSelector("b")).getText().equals(productName)).findFirst().orElse(null);;
		return prod;

	}

	public void addToCart(String productName) {
		WebElement prod=getProductByName(productName);
		prod.findElement(AddtoCart).click();
		waitElementsTOAppear(toastMessage);
		waitElementsTODisappear(spinner);
		
		
		
		
	}





}
