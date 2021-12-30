package com.xworkz.db;

import java.sql.SQLException;

import com.xworkz.db.dao.CountryDAO;
import com.xworkz.db.dto.CountryDTO;

public class CountryTester {

	public static void main(String[] args) throws SQLException {
		CountryDTO countryDTO = new CountryDTO(2, "India", 560079, "Asia");

		CountryDAO countryDAO = new CountryDAO();
		countryDAO.save(countryDTO);

	}
}
