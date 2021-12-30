package com.xworkz.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.db.clubconstants.ClubConstants;
import com.xworkz.db.dto.ClubDTO;

public class ClubDAO {
	Connection mysql = null;

	public boolean save(ClubDTO clubDTO) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				mysql = DriverManager.getConnection(ClubConstants.MYSQL_URL, ClubConstants.MYSQL_USERNAME,
						ClubConstants.MYSQL_Password); 
				String sql = "insert into club values(" + clubDTO.getCid() + ",'" + clubDTO.getName() + "','"
						+ clubDTO.getLocation() + "'," + clubDTO.getPrice() + ")";
				// String sql = "insert into club values(1,'royal','btm',500)";
				System.out.println("formatted:" + sql);
				Statement statement = mysql.createStatement();
				int rowsAffected = statement.executeUpdate(sql);
				if (rowsAffected == 1)
					return true;
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} finally {
			if (mysql != null) {
				mysql.close();
			}
		}
		return false;

	}

	public boolean deletebyid(int id) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				mysql = DriverManager.getConnection(ClubConstants.MYSQL_URL, ClubConstants.MYSQL_USERNAME,
						ClubConstants.MYSQL_Password);
				String sql = "delete from club where idclub="+id;
				Statement statement=mysql.createStatement();
				int rowAffected=statement.executeUpdate(sql);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		} 
		return false;

	}
}
