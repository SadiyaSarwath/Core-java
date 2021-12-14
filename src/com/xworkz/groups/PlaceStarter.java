package com.xworkz.groups;

import com.xworkz.groups.dao.PlaceDAO;

public class PlaceStarter {

	public static void main(String[] args) {
		PlaceDAO dao = new PlaceDAO();
		dao.save("Mysore");
		dao.save("Ooty");
		dao.save("Hyderabad");
		dao.save("Manali");
		dao.save("Coorg");
		
		boolean ref = dao.findMatching("coorg");
		System.out.println(ref);
		
		boolean itr = dao.findMatchingCaseSensitive("ManaLI");
		System.out.println(itr);

		boolean itr1 = dao.findMatchingStartswith("Hyderabr");
		System.out.println(itr1);

		boolean itr2 = dao.findMatchingendswith("Bad");
		System.out.println(itr2);
	}

}
