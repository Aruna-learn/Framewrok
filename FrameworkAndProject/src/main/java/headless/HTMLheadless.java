package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HTMLheadless {

	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver();
		driver.get("https://www.amazon.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
