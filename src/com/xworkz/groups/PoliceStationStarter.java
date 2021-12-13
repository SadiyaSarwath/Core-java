package com.xworkz.groups;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import com.xworkz.groups.dto.PoliceStationDTO;

public class PoliceStationStarter {
	public static void main(String[] args) {
		PoliceStationDTO policeStationDTO = new PoliceStationDTO("Mico Layout", "BTM Layout", "CIVIL", 20);
		PoliceStationDTO policeStationDTO1 = new PoliceStationDTO("Madiwala", "Madiwala", "CRIME", 30);
		PoliceStationDTO policeStationDTO2 = new PoliceStationDTO("Kormangala", "Kormangala", "CIVIL", 40);
		PoliceStationDTO policeStationDTO3 = new PoliceStationDTO("Hosa road", "ElectronicCity", "CRIME", 50);
		PoliceStationDTO policeStationDTO4 = new PoliceStationDTO("Chandapura", "ElectronicCity", "CIVIL", 60);
		PoliceStationDTO policeStationDTO5 = new PoliceStationDTO("Chandapura", "ElectronicCity", "CIVIL", 60);
		Set<PoliceStationDTO> collection = new HashSet<PoliceStationDTO>();
		collection.add(policeStationDTO4);
		collection.add(policeStationDTO);
		collection.add(policeStationDTO2);
		collection.add(policeStationDTO3);
		collection.add(policeStationDTO1);
		System.out.println(collection.size());
		Iterator<PoliceStationDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
