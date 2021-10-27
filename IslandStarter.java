package com.workz.crud;

import com.workz.crud.operator.IslandNames;

public class IslandStarter {

	public static void main(String[] args) {
		IslandNames islandName = new IslandNames();

		String iname = islandName.getCountry();
		System.out.println(iname);
		
		islandName.addIslandNames("Meeru Island");
		islandName.addIslandNames("Maalefushi Island");
		islandName.addIslandNames("Baros Island");
		islandName.addIslandNames("Kuredu Island");
		islandName.displayIslandNames();
		islandName.addIslandNames("Ari atoll Island");

	}




	}

