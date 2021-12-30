package com.xworkz.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.db.clubconstants.FestivalConstants;
import com.xworkz.db.dto.FestivalDTO;

public class FestivalDAO {
	Connection mysql = null;

	public boolean save(FestivalDTO festivalDTO) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				mysql = DriverManager.getConnection(FestivalConstants.MYSQL_URL, FestivalConstants.MYSQL_USERNAME,
						FestivalConstants.MYSQL_Password);
				String sql = "insert into festival values(" + festivalDTO.getFid() + ",'" + festivalDTO.getFname()
						+ "','" + festivalDTO.getFdate() + "'," + festivalDTO.getFstate() + ")";

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
				mysql = DriverManager.getConnection(FestivalConstants.MYSQL_URL, FestivalConstants.MYSQL_USERNAME,
						FestivalConstants.MYSQL_Password);
				String sql = "delete from club where idclub=" + id;
				System.out.println("Deleted:" + sql);
				Statement statement = mysql.createStatement();
				int rowsAffected = statement.executeUpdate(sql);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return false;

	}
}
