package com.xworkz.db;

import java.sql.SQLException;

import com.xworkz.db.dao.TrainDAO;
import com.xworkz.db.dto.TrainDTO;

public class TrainTester {
	public static void main(String[] args) throws SQLException {

		TrainDTO dto = new TrainDTO(9, 1708, "Bangalore", "Goa", 107, 1500, "Second class", "UBL");

		TrainDAO dao = new TrainDAO();
		dao.save(dto);
		System.out.println("================");
		dao.deleteByTrainNO(1);
		System.out.println("================");
		dao.deleteByTrainNoAndTrainId(2, 1);
		System.out.println("=================");
		dao.getByTrainNo(5);
		System.out.println("-----------------");
		dao.getAll();
		System.out.println("-----------------");
		dao.updateDestinationByTrainNo("Salem", "1708");
		System.out.println("--------------");
		dao.getMaxPrice();
		System.out.println("--------------");
		dao.getMinPrice();
	}

}
