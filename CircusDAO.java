package com.xworkz.dp.dao;

import com.xworkz.dp.dto.CircusDTO;

public class CircusDAO {
	private CircusDTO[] circusDTOs = new CircusDTO[999];
	private int circus;

	public void create(CircusDTO dto) {
		System.out.println("invoked create");
		if (dto != null && this.circus < this.circusDTOs.length) {
			this.circusDTOs[this.circus++] = dto;
			System.out.println("added ticketPrice :".concat(String.valueOf(dto.getTicketPrice())));
		} else {
			System.err.println("container is full or null");
		}
	}

	public void create(CircusDTO dto, int index) {
		System.out.println("invoked create with dto and index");
		if (index < this.circusDTOs.length && index >= 0) {
			this.circusDTOs[index + 1] = dto;
			System.out.println("index occupied is :".concat(String.valueOf(dto.getTicketPrice())));
		} else {
			System.out.println("index not occupied :".concat(String.valueOf(index)));
		}
	}

	public int indexOccupied() {
		return circus;
	}

	public boolean matchCircusByName(String owner) {
		System.out.println("invoked matchCircusByName");
		System.out.println("owner name passed :".concat(owner));
		for (int i = 0; i < circusDTOs.length; i++) {
			CircusDTO ref = this.circusDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null :".concat(String.valueOf(i)));
				String tempName = ref.getOwner();
				System.out.println("matching".concat(tempName));
				if (owner.equals(tempName)) {
					System.out.println("Owner name found");
					return true;
				}
			}

		}
		return false;

	}
}
