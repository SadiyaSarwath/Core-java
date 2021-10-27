package com.workz.crud;

import com.workz.crud.operator.ResortNames;

public class ResortStarter {

	public static void main(String[] args) {
		ResortNames resortName = new ResortNames();

		String ename = resortName.getCountry();
		System.out.println(ename);

		resortName.addResortNames("Area 83");
		resortName.addResortNames("Holiday Village Resort");
		resortName.addResortNames("Palm Meadows Resort");
		resortName.addResortNames("The Cassava Retreat");
		resortName.displayResortNames();
		resortName.addResortNames("The Wooden Valley");

	}

}
