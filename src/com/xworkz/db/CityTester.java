package com.xworkz.db;

import java.sql.SQLException;

import com.xworkz.db.dao.CityDAO;
import com.xworkz.db.dto.CityDTO;

public class CityTester  {
public static void main(String[] args) throws SQLException {
	
}
CityDTO cityDTO = new CityDTO(2,"Mysore", "100233","Mysore park");

	CityDAO cityDAO = new CityDAO();
	cityDAO.save(cityDTO);
	
}
