package com.workz.crud.operator;

public class BeachNames {
	private String country = new String();
	private String[] beachname = new String[5];
	private int counter = 0;

	public BeachNames() {
		this("INDIA");
		System.out.println("invoked the no-arg const");
	}

	public BeachNames(String country) {
		this.country = country;
		System.out.println("invoked beachnames string const");

	}

	public String getCountry() {
		return country;
	}

	public void addBeachName(String name) {
		System.out.println("invoked addBeachName");
		System.out.println("Name arg: ".concat(name));
		if (this.counter < 5) {
			this.beachname[this.counter] = name;
			this.counter++;
		} else {
			System.err.println("array is full");
		}
	}

	public void displayBeachName() {
		System.out.println("invoked displayBeachName");
		for (int s = 0; s < this.beachname.length; s++) {
			String name = this.beachname[s];
			System.out.println(name);
		}
	}

}
