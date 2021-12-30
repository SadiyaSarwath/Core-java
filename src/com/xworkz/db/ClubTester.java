package com.xworkz.db;

import java.sql.SQLException;

import com.xworkz.db.dao.ClubDAO;
import com.xworkz.db.dto.ClubDTO;

public class ClubTester {

	public static void main(String[] args) throws SQLException {
		ClubDTO clubDTO = new ClubDTO(5, "Fat Bowl", "JP Nagar", 700);

		ClubDAO clubDAO = new ClubDAO();
		//clubDAO.save(clubDTO);
		clubDAO.deletebyid(5);
	}
	

}
