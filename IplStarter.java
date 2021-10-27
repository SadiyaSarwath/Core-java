package com.xworkz.dp.dto;

import com.xworkz.dp.dao.*;

public class IplStarter {

	public static void main(String[] args) {
		IplDAO dao = new IplDAO();
		IplDTO iplDto = new IplDTO(23, 5, "Shahrukh Khan", "KKR");

		dao.create(iplDto);
		dao.create(new IplDTO(24, 4, null, "RCB"));
		dao.create(null);
		dao.create(new IplDTO(25, 2, null, "CSK"), 97);
		System.out.println(dao.indexOccupied());

		dao.create(new IplDTO(25, 2, "Mukesh", "DD"));
		System.out.println(dao.indexOccupied());
		int pine = dao.indexOccupied();
		System.out.println(dao.indexOccupied());

		boolean found = dao.matchIplByName("DD");
		System.out.println(found);
	}

}
