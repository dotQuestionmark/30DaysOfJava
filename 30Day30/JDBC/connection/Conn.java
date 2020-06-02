package jdbc;

import java.sql.*;

public class Conn {
	public static void main(String args[]) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/write your schema name here", "root", "write your password here");
		Statement stmt = con.createStatement();
		stmt.executeUpdate("create table employe(empid int(10),  name varchar(20), salary int(10))");
		con.close();
	}
}

