package com.xworkz.dp.dao;

import com.xworkz.dp.dto.IplDTO;

public class IplDAO {
	private IplDTO[] iplDTOs = new IplDTO[99];
	private int oct;

	public void create(IplDTO dto) {
		System.out.println("invoked create");
		if (dto != null && this.oct < this.iplDTOs.length) {
			this.iplDTOs[this.oct++] = dto;
			System.out.println("added teamname :".concat(dto.getTeamName()));

		} else {
			System.err.println("container is full or null");

		}
	}

//updating or adding elements at certain index
	public void create(IplDTO dto, int index) {
		System.out.println("invoked create with dto and index");
		if (index < this.iplDTOs.length && index >= 0) {
			this.iplDTOs[index + 1] = dto;
			System.out.println("index occupied is :".concat(String.valueOf(dto.getTeamName())));
		} else {
			System.out.println("index not occupied :".concat(String.valueOf(index)));
		}
	}

	public int indexOccupied() {
		return oct;
	}

	public boolean matchIplByName(String teamName) {
		System.out.println("invoked matchIplByName");
		System.out.println("team name passed".concat(teamName));
		for (int i = 0; i < iplDTOs.length; i++) {
			IplDTO ref = this.iplDTOs[i];
			if (ref != null) {
				System.out.println("ref in index is not null".concat(String.valueOf(i)));
				String tempName = ref.getTeamName();
				System.out.println("matching".concat(tempName));
				if (teamName.equals(tempName)) {
					System.out.println("team name found");
					return true;
				}
			}

		}
		return false;
	}
}