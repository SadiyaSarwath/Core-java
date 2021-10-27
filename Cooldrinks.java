package com.workz.crud.operator;

public class Cooldrinks {
	// String name;
	private String[] brandNames = new String[6];
	// private String name;
	private int count;

	public String[] getBrandNames() {
	return brandNames;
	}

	public void addbrandNames(String name) {
	// this.name = name;
	if (this.count < this.brandNames.length) {
	this.brandNames[this.count++] = name;
	// System.out.println("invoked addbrandNames: ".concat(name));
	} else {
	System.out.println("cannot add : ".concat(name).concat(" the length of the array is : ")
	.concat(String.valueOf(this.brandNames.length)));
	}
	}

	public void delete(int location) {
	if (location < this.brandNames.length && location >= 0) {
	this.brandNames[location] = null;
	for (int i = 0; i < brandNames.length; i++) {

	System.out.println("invoked deletebrandNames: ".concat(String.valueOf(this.brandNames[i])));
	}
	} else {
	System.err.println("error");
	}
	}

	public void update(int location, String newname) {
	if (location < this.brandNames.length && location >= 0) {
	this.brandNames[location] = newname;

	for (int i = 0; i < brandNames.length; i++) {
	System.out.println("invoked updatebrandNames: ".concat(String.valueOf(this.brandNames[i])));
	}
	} else {
	System.err.println("error");
	}
	}
	}

