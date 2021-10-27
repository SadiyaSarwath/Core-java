package com.workz.crud.operator;

public class GinNames {
	private String type = new String();
	private String[] ginname = new String[4];
	private int count = 0;

	public GinNames() {
		this("LIQUOR");
		System.out.println("invoked no-arg const");

	}

	public GinNames(String type) {
		this.type = type;
		System.out.println("invoked string const");

	}

	public String getType() {
		return type;

	}

	public void addGinNames(String name) {
		System.out.println("invoked addGinNames");
		System.out.println("Name arg:".concat(name));
		if (this.count < 4) {
			this.ginname[this.count] = name;
			this.count++;
		} else {
			System.out.println("array is full");

		}

	}

	public void displayGinNames() {
		System.out.println("invoked displayGinNames");
		for (int g = 0; g < this.ginname.length; g++) {
			String name = this.ginname[g];
			System.out.println(name);

		}

	}

}


