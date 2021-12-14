package com.xworkz.groups;

import com.xworkz.groups.dao.ClothingBrandDAO;


public class ClothingBrandStarter {

		public static void main(String[] args) {
			ClothingBrandDAO dao = new ClothingBrandDAO();
			dao.save("GUCCI");
			dao.save("H & M");
			dao.save("Forever21");
			dao.save("Adidas");
			dao.save("Allen solly");
			
			boolean ref = dao.findMatching("H & M");
			System.out.println(ref);
			
			boolean itr = dao.findMatchingCaseSensitive("gucci");
			System.out.println(itr);

			boolean itr1 = dao.findMatchingStartswith("Adidas");
			System.out.println(itr1);

			boolean itr2 = dao.findMatchingendswith("solly");
			System.out.println(itr2);
		}

	}




