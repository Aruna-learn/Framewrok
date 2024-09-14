package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCConnection {
	public static void main(String[] args) throws Throwable {
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		Statement stmt=con.createStatement();
		String query="select*from emp";
		stmt.executeQuery(query);
		ResultSet rs=stmt.executeQuery(query);
		while(rs.next()) {
			String naming=rs.getString("name");
			String locationde=rs.getString("location");

			System.out.println(naming+"   "+locationde);
		}


		con.close();
		System.out.println("data fetched");


	}
}
