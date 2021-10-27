package com.workz.crud;

import com.workz.crud.operator.BeachNames;

public class BeachStarter {

	public static void main(String[] args) {

		BeachNames beachName = new BeachNames();

		String bname = beachName.getCountry();
		System.out.println(bname);

		beachName.addBeachName("colva beach");
		beachName.addBeachName("malpe beach");
		beachName.addBeachName("butterfly beach");
		beachName.addBeachName("miramar beach");
		beachName.addBeachName("vagator beach");
		beachName.displayBeachName();
		beachName.addBeachName("karwar beach");

	}

}
