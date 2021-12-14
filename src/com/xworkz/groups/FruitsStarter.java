package com.xworkz.groups;

import com.xworkz.groups.dao.FruitsDAO;

public class FruitsStarter {

		public static void main(String[] args) {
			FruitsDAO dao = new FruitsDAO();
			dao.save("Mango");
			dao.save("Watermelon");
			dao.save("Strawberry");
			dao.save("Guava");
			dao.save("Banana");
			
			boolean ref = dao.findMatching("mango");
			System.out.println(ref);
			
			boolean itr = dao.findMatchingCaseSensitive("StrawBerry");
			System.out.println(itr);

			boolean itr1 = dao.findMatchingStartswith("guava");
			System.out.println(itr1);

			boolean itr2 = dao.findMatchingendswith("Watermelon");
			System.out.println(itr2);
		}

	}



