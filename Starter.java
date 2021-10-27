package com.xworkz.dp;

import com.xworkz.dp.dto.BraceletDTO;

public class Starter {
	public static void main(String[] args) {
		BraceletDTO braceletDTO = new BraceletDTO();
		braceletDTO.setColor("Gold");
		braceletDTO.setMaterial("platinum");
		braceletDTO.setPrice(2500.0f);
		braceletDTO.setGemused(false);
		braceletDTO.setGifted(true);

		BraceletDTO braceletDTO2 = new BraceletDTO("Blue", "diamond", 5500.0f, true, true);
		BraceletDTO braceletDTO3 = new BraceletDTO("Pink", "silver", 6500.0f, false, true);
		BraceletDTO braceletDTO4 = new BraceletDTO("Red", "platinum", 7500.0f, true, false);
		BraceletDTO braceletDTO5 = new BraceletDTO("Purple", "gold", 8500.0f, true, false);

		// group all bracelet
		BraceletDTO[] brace = new BraceletDTO[5];
		brace[0] = braceletDTO;
		brace[1] = braceletDTO3;
		brace[2] = braceletDTO2;
 		brace[4] = braceletDTO5;
		for (int i = 0; i < brace.length; i++) {
			BraceletDTO ref = brace[i];
			if (ref != null) {
				System.out.println(ref.getColor());
				System.out.println(ref.getMaterial());
				System.out.println(ref.getPrice());
				System.out.println(ref.isGemused());
				System.out.println(ref.isGifted());
			} else {
				System.err.println("Index is pointing to null".concat(String.valueOf(i)));
			}

		}

	}
}
