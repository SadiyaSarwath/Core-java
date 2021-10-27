package com.xworkz.choco.operator;

public class ChocolateNames {
	private String brand = new String();
	private String[] chocolatename = new String[5];
	private int counter = 0;

	public ChocolateNames() {
		this("CADBURY");
		System.out.println("invoked no-arg const");
	}

	public ChocolateNames(String brand) {
		this.brand = brand;
		System.out.println("invoked string const");
	}

	public String getBrand() {
		return brand;

	}

	public void addChocolateNames(String name) {
			 System.out.println("invoked addChocolateNames");
			 System.out.println("Name arg:" .concat(name));
			 if(this.counter<5) {
				 this.chocolatename[this.counter]=name;
				 this.counter++;
			 }else {
				 System.err.println("array is full");
				 
			 }
	}

	public void displayChocolateNames() {
				 System.out.println("invoked displayChocolateNames");
				 for(int c=0; c < this.chocolatename.length; c++) {
					 String name=this.chocolatename[c];
				 System.out.println(name);
				 
			 }
		 }

	}
