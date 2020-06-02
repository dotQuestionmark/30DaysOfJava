package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class insert {
	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/write your schema name here", "root", "write your password here");
		Statement stmt = con.createStatement();
		Scanner in = new Scanner(System.in);
		stmt.executeUpdate("INSERT INTO `employe` VALUES (500068802,'harshil bhardwaj',1000000)");
		con.close();
	}
}

