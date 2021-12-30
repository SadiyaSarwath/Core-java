package com.xworkz.db;

import java.sql.SQLException;

import com.xworkz.db.dao.FestivalDAO;
import com.xworkz.db.dto.FestivalDTO;

public class FestivalTester {

	public static void main(String[] args) throws SQLException {

		FestivalDTO festivalDTO=new FestivalDTO(2,"Ramzan","17-08-2021","Karnataka");
		
		
		FestivalDAO festivalDAO=new FestivalDAO();
		festivalDAO.save(festivalDTO);
		
	}

}
