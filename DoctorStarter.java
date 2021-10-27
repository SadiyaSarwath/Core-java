package com.xworkz.dp.dto;

import com.xworkz.dp.dao.DoctorDAO;

public class DoctorStarter {

	public static void main(String[] args) {
		DoctorDAO dao = new DoctorDAO();
		DoctorDTO dto2 = new DoctorDTO("sadiya", "xyz", "manipal", 'F', 1000.0f);
		dao.create(dto2);

		

	}

}
