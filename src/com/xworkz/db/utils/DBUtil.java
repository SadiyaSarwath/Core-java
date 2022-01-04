package com.xworkz.db.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.xworkz.db.clubconstants.DBConstants;

public class DBUtil {
	public static Connection createConnection() {
		Connection connection;
		try {
			connection = DriverManager.getConnection(DBConstants.MYSQL_URL, DBConstants.MYSQL_USERNAME,
					DBConstants.MYSQL_Password);
			return connection;
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return null;
	}

	public static void closeConnection(Connection connection) {
		if (connection != null)
			try {

				connection.close();
				System.out.println("Closed the resource");

			} catch (SQLException e) {

				e.printStackTrace();
			}

	}

}
