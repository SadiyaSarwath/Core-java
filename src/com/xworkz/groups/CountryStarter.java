package com.xworkz.groups;

import com.xworkz.groups.dao.CountryDAO;

public class CountryStarter {
	public static void main(String[] args) {
		CountryDAO dao = new CountryDAO();
		dao.save("Australia");
		dao.save("Germany");
		dao.save("New york");
		dao.save("Turkey");
		dao.save("Saudi arabia");
		
		boolean ref = dao.findMatching("Australia");
		System.out.println(ref);
		
		boolean itr = dao.findMatchingCaseSensitive("GermaNy");
		System.out.println(itr);

		boolean itr1 = dao.findMatchingStartswith("turkey");
		System.out.println(itr1);

		boolean itr2 = dao.findMatchingendswith("venice");
		System.out.println(itr2);
	}

}


