package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumJDBC {

	public static void main(String[] args) throws Throwable {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement stmt=con.createStatement();
		String query="select*from emp";
		stmt.executeQuery(query);
		ResultSet rs=stmt.executeQuery("select * from emp where name ='Aruna'");

		while(rs.next())

		{

		WebDriver driver= new ChromeDriver();

		driver.get("https://login.salesforce.com");

		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("name"));

		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("location"));

		}

	}

}
