package com.workz.crud.operator;

public class IslandNames {
	private String country = new String();
	private String[] islandname = new String[4];
	private int count = 0;

	public IslandNames() {
		this("MALDIVES");
		System.out.println("invoked no-arg const");

	}

	public IslandNames(String country) {
		this.country = country;
		System.out.println("invoked string const");

	}

	public String getCountry() {
		return country;

	}

	public void addIslandNames(String name) {
		System.out.println("invoked addIslandNames");
		System.out.println("Name arg:".concat(name));
		if (this.count < 4) {
			this.islandname[this.count] = name;
			this.count++;
		} else {
			System.err.println("array is full");

		}

	}

	public void displayIslandNames() {
		System.out.println("invoked displayIslandNames");
		for (int i = 0; i < this.islandname.length; i++) {
			String name = this.islandname[i];
			System.out.println(name);

		}

	}

}
