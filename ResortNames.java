package com.workz.crud.operator;

public class ResortNames {
	private String country = new String();
	private String[] resortname = new String[4];
	private int count = 0;

	public ResortNames() {
		this("INDIA");
		System.out.println("invoked no-arg const");

	}

	public ResortNames(String country) {
		this.country = country;
		System.out.println("invoked string const");

	}

	public String getCountry() {
		return country;

	}

	public void addResortNames(String name) {
		System.out.println("invoked addResortNames");
		System.out.println("Name arg:".concat(name));
		if (this.count < 4) {
			this.resortname[this.count] = name;
			this.count++;
		} else {
			System.err.println("array is full");

		}

	}

	public void displayResortNames() {
		System.out.println("invoked displayGinNames");
		for (int e = 0; e < this.resortname.length; e++) {
			String name = this.resortname[e];
			System.out.println(name);

		}

	}

}
