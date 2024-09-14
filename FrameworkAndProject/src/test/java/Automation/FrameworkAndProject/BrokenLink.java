package Automation.FrameworkAndProject;

import static org.testng.Assert.assertTrue;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import junit.framework.Assert;

public class BrokenLink {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		Set<String> brokenlinkUrls = new HashSet<String>();
		List<WebElement>	links=driver.findElements(By.cssSelector("li[class='gf-li'] a"));//links having tag as a so we used as "a"
		System.out.println(links.size());//prints size of links

		SoftAssert sf=new SoftAssert();
		for (WebElement link : links) {
			//ieate each and every link
			String urle=link.getAttribute("href");
			URL url=new URL(urle);//URL is class in java and pass the linkurl instance 

			URLConnection urlconnection=url.openConnection();//open the connection to url and stores in urlconnection
			//in web application we have 2types of requests http and https and here we use http to send the request to server
			HttpURLConnection httpurlconnection=(HttpURLConnection) urlconnection;//HttpURLConnection is abstract class we can't create in stance so we assign urlconnection and type cast, urlconnection is converted into httpurl connection


			httpurlconnection.setRequestMethod("HEAD");

			httpurlconnection.connect();
			int code=httpurlconnection.getResponseCode();
			System.out.println(code);

			sf.assertTrue(code<400, "link with text is:"+link.getText()+"broken link is:"+code);
			//		if(code<400) {
			//			System.out.println("link with text is:"+link.getText()+"broken link is:"+code);
			//			Assert.assertTrue(true);
			//		}
			sf.assertAll();

		}

	}

}











//public class BrokenLinks {
//
//
//
//public static void main(String[] args) throws MalformedURLException, IOException {
//
//// TODO Auto-generated method stub
//
//System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
//
//         WebDriver driver=new ChromeDriver();

         

         //broken URL

         //Step 1 - IS to get all urls tied up to the links using Selenium

         //  Java methods will call URL's and gets you the status code

         //if status code >400 then that url is not working-> link which tied to url is broken

         //a[href*="soapui"]'

        // driver.get("https://rahulshettyacademy.com/AutomationPractice/");

         

         

//      List<WebElement> links=   driver.findElements(By.cssSelector("li[class='gf-li'] a"));
//
//      SoftAssert a =new SoftAssert();
//
//     
//
//      for(WebElement link : links)
//
//      {
//
//       
//
//          String url= link.getAttribute("href");
//
//         
//
//          HttpURLConnection   conn= (HttpURLConnection)new URL(url).openConnection();
//
//          conn.setRequestMethod("HEAD");
//
//          conn.connect();
//
//          int respCode = conn.getResponseCode();
//
//          System.out.println(respCode);
//
//          a.assertTrue(respCode<400, "The link with Text"+link.getText()+" is broken with code" +respCode);
//
//         
//
//     
//
//      }
//
//     
//
//      a.assertAll();
//
//   
//
//     
//
//     
//
//         
//
//         
//
//         
//
//         
//
//         
//
//     
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//       
//
//         
//
//         
//
//         
//
//}
//
//
//
//private static Object getReturnCode(WebElement link) {
//
//// TODO Auto-generated method stub
//
//return null;
//
//}
//
//
//
//}

