package com.workz.crud.operator;

public class RestaurantNames {
	private String area = new String();
	private String[] resname = new String[4];
	private int count = 0;

	public RestaurantNames() {
		this("KORMANGALA");
		System.out.println("invoked no-arg const");

	}

	public RestaurantNames(String area) {
		this.area = area;
		System.out.println("invoked string const");

	}

	public String getArea() {
		return area;

	}

	public void addRestaurant(String name) {
		System.out.println("invoked addRestaurantNames");
		System.out.println("Name arg:".concat(name));
		if (this.count < 4) {
			this.resname[this.count] = name;
			this.count++;
		} else {
			System.err.println("array is full");

		}

	}

	public void displayRestaurantNames() {
		System.out.println("invoked displayRestaurantNames");
		for (int r = 0; r < this.resname.length; r++) {
			String name = this.resname[r];
			System.out.println(name);

		}

	}

}
