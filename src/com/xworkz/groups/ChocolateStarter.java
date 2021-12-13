package com.xworkz.groups;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.groups.dto.ChocolateDTO;

public class ChocolateStarter {

	public static void main(String[] args) {
		ChocolateDTO chocolateDTO = new ChocolateDTO("Dairy milk", "cadbury", 25);
		ChocolateDTO chocolateDTO1 = new ChocolateDTO("Silk", "cadbury", 15);
		ChocolateDTO chocolateDTO2 = new ChocolateDTO("Kit kat", "cadbury", 45);
		ChocolateDTO chocolateDTO3 = new ChocolateDTO("Munch", "cadbury", 5);
		ChocolateDTO chocolateDTO4 = new ChocolateDTO("Milky bar", "cadbury", 20);
		Set<ChocolateDTO> collection = new HashSet<ChocolateDTO>();
		collection.add(chocolateDTO1);
		collection.add(chocolateDTO4);
		collection.add(chocolateDTO2);
		collection.add(chocolateDTO);
		collection.add(chocolateDTO3);
		System.out.println(collection.size());
		Iterator<ChocolateDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
