package com.xworkz.groups;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.groups.dto.ArmyDTO;

public class ArmyStarter {

	public static void main(String[] args) {
		ArmyDTO armyDTO = new ArmyDTO("Manoj Kumar Pandey", "marine corps");
		ArmyDTO armyDTO1 = new ArmyDTO("Manoj ", "navy");
		ArmyDTO armyDTO2 = new ArmyDTO(" Kumar Pandey", "air force");
		ArmyDTO armyDTO3 = new ArmyDTO("Manoj  Pandey", "space force");
		ArmyDTO armyDTO4 = new ArmyDTO("Sal Bahadur Limbu", "marine corps");

		Set<ArmyDTO> collection = new HashSet<ArmyDTO>();
		collection.add(armyDTO);
		collection.add(armyDTO4);
		collection.add(armyDTO2);
		collection.add(armyDTO3);
		collection.add(armyDTO1);
		System.out.println(collection.size());
		Iterator<ArmyDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
