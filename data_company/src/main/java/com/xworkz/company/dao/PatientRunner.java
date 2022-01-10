package com.xworkz.company.dao;

import com.xworkz.company.entity.PatientEntity;

public class PatientRunner {
	public static void main(String[] args) {
		PatientEntity p = new PatientEntity(1, "amaira", "shimoga", false, 24, 4678);
		PatientEntity p2 = new PatientEntity(2, "shilpa", "hassan", true, 35, 4679);
		PatientEntity p3 = new PatientEntity(3, "sourab", "salem", false, 18, 46711);
		PatientEntity p4 = new PatientEntity(4, "shahid", "ramanagar", true, 54, 4672);
		PatientEntity p5 = new PatientEntity(5, "chikku", "shimoga", false, 65, 4674);

		PatientDAO dao = new PatientDAOImpl();
		dao.create(p);
		dao.create(p2);
		dao.create(p3);
		dao.create(p4);
		dao.create(p5);

	}

}
