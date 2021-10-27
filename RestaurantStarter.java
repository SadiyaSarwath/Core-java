package com.workz.crud;

import com.workz.crud.operator.RestaurantNames;

public class RestaurantStarter {

	public static void main(String[] args) {

		RestaurantNames resName = new RestaurantNames();

		String rname = resName.getArea();
		System.out.println(rname);

		resName.addRestaurant("7 plates");
		resName.addRestaurant("Madina hotel");
		resName.addRestaurant("Empire");
		resName.addRestaurant("IDC");
		resName.displayRestaurantNames();

	}

}