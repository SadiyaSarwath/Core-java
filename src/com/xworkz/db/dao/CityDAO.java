package com.xworkz.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.db.clubconstants.CityConstants;
import com.xworkz.db.dto.CityDTO;

public class CityDAO {
	Connection mysql = null;

	public boolean save(CityDTO cityDTO) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				mysql = DriverManager.getConnection(CityConstants.MYSQL_URL, CityConstants.MYSQL_USERNAME,
						CityConstants.MYSQL_Password);
				String sql = "insert into city values(" + cityDTO.getCid() + ",'" + cityDTO.getCname() + "','"
						+ cityDTO.getPopulation() + "'," + cityDTO.getFamousfor() + ")";

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
				mysql = DriverManager.getConnection(CityConstants.MYSQL_URL, CityConstants.MYSQL_USERNAME,
						CityConstants.MYSQL_Password);
				String sql = "delete from city where cid=" + id;
				Statement statement = mysql.createStatement();
				int rowAffected = statement.executeUpdate(sql);
			} catch (SQLException e) {

				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		return false;

	}
}
