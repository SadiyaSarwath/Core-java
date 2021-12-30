package com.xworkz.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.db.clubconstants.CountryConstants;
import com.xworkz.db.dto.CountryDTO;

public class CountryDAO {
	Connection mysql = null;

	public boolean save(CountryDTO countryDTO) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				mysql = DriverManager.getConnection(CountryConstants.MYSQL_URL, CountryConstants.MYSQL_USERNAME,
						CountryConstants.MYSQL_Password); 
				String sql = "insert into country values(" + countryDTO.getCid() + ",'" + countryDTO.getName() + "','"
						+ countryDTO.getCcode() + "'," + countryDTO.getContinent() + ")";
				
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
				mysql = DriverManager.getConnection(CountryConstants.MYSQL_URL, CountryConstants.MYSQL_USERNAME,
						CountryConstants.MYSQL_Password);
				String sql = "delete from country where cid="+id;
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


