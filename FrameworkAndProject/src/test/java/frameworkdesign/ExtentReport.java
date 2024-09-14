package frameworkdesign;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	ExtentReports extentreports;
	
	
	@BeforeTest
	public void config() {
	 extentreports=new ExtentReports();//main engine


	File file=new File("extentreports.html");

	ExtentSparkReporter SparkReporter =new ExtentSparkReporter(file);

	extentreports.attachReporter(SparkReporter);

	//We have to apply configuration for the extent report using spark reporter object onlyy because for every thing we can fdifferent configurations and beautiful and if we use the extenreporter object we get 1 kind of confuguration only
	
	
	//Change the theme
	SparkReporter.config().setTheme(Theme.DARK);
	
	
	//Change report name
	SparkReporter.config().setReportName("ARUNA REDDY");
	
	//Change the document title
	SparkReporter.config().setDocumentTitle("Leaarning ExtentReports");
	
	
	//Change the data and timestamp
	SparkReporter.config().setTimeStampFormat("dd-mm-yy - HH:MM:SS");
	
	
	//Change the css of element data and timestamp
	SparkReporter.config().setCss(".badge-primary{background-color:yellow}");
	
	
	//remove the logo color 
	SparkReporter.config().setJs("document.getElementsByClassName('logo')[0].style.display='none';");
	
//	extentreports.createTest("Configuration","Configuration information")
//	.assignAuthor("aruna")
//	.assignCategory("smoke")
//	.assignDevice("chrome 98")
//	.pass("this test is passeed");
	
	
	
	
	
	
	
	
//	extentreports.flush();
//	Desktop.getDesktop().browse(new File("extentreports.html").toURI());
	
	
	
	}
	
	
	
	
	
	
	@Test
	public void initializeDemo() throws Throwable {
		ExtentTest reports=extentreports.createTest("Configuration","Configuration information");
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		System.out.println(driver.getTitle());
		driver.close();
		extentreports.flush();
		Desktop.getDesktop().browse(new File("extentreports.html").toURI());
		
	}
}
