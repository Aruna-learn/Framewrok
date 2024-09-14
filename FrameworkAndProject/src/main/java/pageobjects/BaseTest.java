package pageobjects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class BaseTest {

	public WebDriver driver;
	public Landingpage loginp;
	public WebDriver initializebrowser() throws Throwable {

		//properties class
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\resourcesglobalproperties\\Globaldata.properties");

		//System.getProperty automatically get the project location path in our system
		prop.load(fis);
		String BrowserName=	prop.getProperty("browser");





		if(BrowserName.equalsIgnoreCase("chrome"))	{
			//to run in headless mode
			ChromeOptions options=new ChromeOptions();
			if(BrowserName.contains("headless")) {
				options.addArguments("--headless");
			}
			
			
			
			
			 driver=new ChromeDriver(options);
			 //to run in full screen mode
			 driver.manage().window().setSize(new Dimension(1440,900));;



		}
		else if (BrowserName.equalsIgnoreCase("edge")) {
			//edge
			driver=new EdgeDriver();
		}
		else if (BrowserName.equalsIgnoreCase("firefox")) {
			//firefox
			driver=new FirefoxDriver();

		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		return driver;
	}
	public List<HashMap<String, String>> getJsonDataToMap(String filePath) throws IOException
	{
		//read json to string
	String jsonContent = 	FileUtils.readFileToString(new File(filePath), 
			StandardCharsets.UTF_8);
	
	//String to HashMap- Jackson Databind
	
	ObjectMapper mapper = new ObjectMapper();
	  List<HashMap<String, String>> data = mapper.readValue(jsonContent, new TypeReference<List<HashMap<String, String>>>() {
      });
	  return data;
	
	//{map, map}

	}
	
	public String getScreenshot(String testCaseName,WebDriver driver) throws IOException
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File file = new File(System.getProperty("user.dir") + "//report//" + testCaseName + ".png");
		FileUtils.copyFile(source, file);
		return System.getProperty("user.dir") + "//reports//" + testCaseName + ".png";
		
		
	}
	
	@BeforeMethod
	public Landingpage launchApplication() throws Throwable {
		driver=initializebrowser();
		loginp=new Landingpage(driver);
		loginp.goTo();
		return loginp;
	}
	
	@AfterMethod
	public void tearDown()  {
		driver.close();
	}

}
