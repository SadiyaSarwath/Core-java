package com.xworkz.groups;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.groups.dto.HospitalDTO;

public class HospitalStarter {
	public static void main(String[] args) {
		HospitalDTO hospitalDTO = new HospitalDTO("sadiya", "btm layout", 10);
		HospitalDTO hospitalDTO1 = new HospitalDTO("sadi", "jayanagar", 15);
		HospitalDTO hospitalDTO2 = new HospitalDTO("sad", "domlur", 20);
		HospitalDTO hospitalDTO3 = new HospitalDTO("saddy", "btm ", 25);
		HospitalDTO hospitalDTO4 = new HospitalDTO("sarwath", "btm layout", 30);

		Set<HospitalDTO> collection = new HashSet<HospitalDTO>();
		collection.add(hospitalDTO1);
		collection.add(hospitalDTO4);
		collection.add(hospitalDTO2);
		collection.add(hospitalDTO);
		collection.add(hospitalDTO3);
		System.out.println(collection.size());
		Iterator<HospitalDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
