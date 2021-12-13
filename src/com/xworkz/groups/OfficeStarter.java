package com.xworkz.groups;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.groups.dto.OfficeDTO;

public class OfficeStarter {

	public static void main(String[] args) {
		OfficeDTO officeDTO = new OfficeDTO("X-workz", "btm layout", 50);
		OfficeDTO officeDTO1 = new OfficeDTO("Quest", " yelanka", 40);
		OfficeDTO officeDTO2 = new OfficeDTO("Intellect", "domlur", 30);
		OfficeDTO officeDTO3 = new OfficeDTO("Capgemini", "kormangala", 20);
		OfficeDTO officeDTO4 = new OfficeDTO("TCS", "electronic city", 10);

		Set<OfficeDTO> collection = new HashSet<OfficeDTO>();
		collection.add(officeDTO1);
		collection.add(officeDTO);
		collection.add(officeDTO3);
		collection.add(officeDTO2);
		collection.add(officeDTO4);
		System.out.println(collection.size());
		Iterator<OfficeDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
