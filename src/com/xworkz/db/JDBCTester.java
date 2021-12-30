package com.xworkz.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTester {

	public static void main(String[] args) throws SQLException {
		System.out.println("after driver class is loaded and registered");
		String url = "jdbc:mysql://localhost:3306/song";// protocol:value:
		String username = "root";
		String password = "root";
		Connection mysql = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			mysql = DriverManager.getConnection(url, username, password);
			if (mysql.isClosed()) {
				System.out.println("mysql is open");
				String sql = "insert into club values(3,'gilly','btm',600)";
				Statement statement = mysql.createStatement();
				int rowsAffected = statement.executeUpdate(sql);
				System.out.println("total rows affected:" + rowsAffected);
				
			}
			System.out.println("after driver is loaded and registered");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (mysql != null) {
				mysql.close();
				System.out.println("mysql is closed");
			}
		}
	}
}
