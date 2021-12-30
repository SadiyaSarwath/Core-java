package com.xworkz.db.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import com.xworkz.db.clubconstants.IConstants;
import com.xworkz.db.dto.IceCreamDTO;

public class IceCreamDAO {
	Connection mysql = null;

	public boolean save(IceCreamDTO iceDTO) throws SQLException {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			try {
				mysql = DriverManager.getConnection(IConstants.MYSQL_URL, IConstants.MYSQL_USERNAME,
						IConstants.MYSQL_Password); 
				String sql = "insert into icecream values(" + iceDTO.getIdIce() + ",'" + iceDTO.getCflavour() + "','"
						+ iceDTO.getCname() + "'," + iceDTO.getCprice() + ")";
			
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
				mysql = DriverManager.getConnection(IConstants.MYSQL_URL, IConstants.MYSQL_USERNAME,
						IConstants.MYSQL_Password);
				String sql = "delete from icecream where idIceCream="+id;
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


