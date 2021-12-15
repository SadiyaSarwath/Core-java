package com.xworkz.groups;

import com.xworkz.groups.dao.PincodeDAO;

public class PincodeStarter {

	public static void main(String[] args) {
		PincodeDAO dao = new PincodeDAO();
		dao.save(560029);
		dao.save(583103);
		dao.save(560076);
		dao.save(560089);
		dao.save(45674);
		boolean code = dao.save(560029);
		System.out.println(code);

		

		boolean code1 = dao.findMatchingStartsWithChars(56);
		System.out.println(code);

		boolean code2=dao.findMatchingEndsWithChars(600);
		System.out.println(code2);
	}

}
