package com.xworkz.company.dao;


import com.xworkz.company.entity.StateEntity;

public class StateRunner {

	public static void main(String[] args) {

		StateEntity se = new StateEntity(1, "andhra pradesh", 10, "hyderabad");
		StateEntity se2 = new StateEntity(2, "assam", 20, "itanagar");
		StateEntity se3 = new StateEntity(3, "bihar", 30, "patna");
		StateEntity se4 = new StateEntity(4, "karnataka", 40, "bangalore");
		StateEntity se5 = new StateEntity(5, "rajasthan", 10, "jaipur");

		StateDAO dao = new StateDAOImpl();
		dao.create(se);
		dao.create(se2);
		dao.create(se3);
		dao.create(se4);
		dao.create(se5);
	}
}