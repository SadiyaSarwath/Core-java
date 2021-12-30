package com.xworkz.db;

import java.sql.SQLException;

import com.xworkz.db.dao.IceCreamDAO;
import com.xworkz.db.dto.IceCreamDTO;

public class IceCreamTester {

	public static void main(String[] args) throws SQLException {
		IceCreamDTO iceDTO = new IceCreamDTO(2, "vanilla", "amul", 20);

		IceCreamDAO iceDAO = new IceCreamDAO();
		iceDAO.save(iceDTO);
		
	}
	

	}


