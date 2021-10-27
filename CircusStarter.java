package com.xworkz.dp.dto;

import com.xworkz.dp.dao.CircusDAO;

public class CircusStarter {

	public static void main(String[] args) {
		CircusDAO dao = new CircusDAO();
		CircusDTO dto1=new CircusDTO(null, 0, 0, 0, null);
		dao.create(dto1);
		

	}

}
