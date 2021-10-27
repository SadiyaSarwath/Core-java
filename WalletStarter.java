package com.xworkz.dp.dto;

import com.xworkz.dp.dao.WalletDAO;

public class WalletStarter {

	public static void main(String[] args) {
		WalletDTO dto1 = new WalletDTO("Puma", "leather", 5, 2000.0f, 4);
		WalletDAO dao = new WalletDAO();
		dao.create(dto1);
		dao.create(new WalletDTO("Titan", null, 10, 500.0f, 2));
		dao.create(null);
		dao.create(new WalletDTO("Allen Solly", "leather", 5, 1100.0f, 2),878);
		System.out.println(dao.indexOccupied());

		dao.create(new WalletDTO("Urban Forest", "rubber", 8, 1500.0f, 5));
		System.out.println(dao.indexOccupied());
		int cash = dao.indexOccupied();
		System.out.println(dao.indexOccupied());

		boolean found = dao.matchWalletByName("Bally");
		System.out.println(found);

	}

}
