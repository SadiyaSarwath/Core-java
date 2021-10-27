package com.xworkz.dp.dao;

import com.xworkz.dp.dto.WalletDTO;

public class WalletDAO {
	private WalletDTO[] walletDTOs = new WalletDTO[999];
	private int wall;

	public void create(WalletDTO dto) {
		System.out.println("invoked create");
		if (dto != null && this.wall < this.walletDTOs.length) {
			this.walletDTOs[this.wall++] = dto;
			System.out.println("added companyName :".concat(dto.getCompanyName()));
		} else {
			System.err.println("container is full or null");
		}
	}

	public void create(WalletDTO dto, int index) {
		System.out.println("invoked create with dto and index");
		if (index < this.walletDTOs.length && index >= 0) {
			this.walletDTOs[index + 1] = dto;
			System.out.println("index occupied is :".concat(String.valueOf(dto.getCompanyName())));
		} else {
			System.out.println("index not occupied :".concat(String.valueOf(index)));
		}
	}

	public int indexOccupied() {
		return wall;
	}

	public boolean matchWalletByName(String companyName) {
		System.out.println("invoked matchIplByName");
		System.out.println("team name passed :".concat(companyName));
		for (int i = 0; i < walletDTOs.length; i++) {
			WalletDTO ref = this.walletDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null :".concat(String.valueOf(i)));
				String tempName = ref.getCompanyName();
				System.out.println("matching".concat(tempName));
				if (companyName.equals(tempName)) {
					System.out.println("company name found");
					return true;
				}
			}

		}
		return false;

	}
}
