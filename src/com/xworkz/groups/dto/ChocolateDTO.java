package com.xworkz.groups.dto;

public class ChocolateDTO {

	private String name, brand;
	private int noOfChocolates;

	public ChocolateDTO(String name, String brand, int noOfChocolates) {
		super();
		this.name = name;
		this.brand = brand;
		this.noOfChocolates = noOfChocolates;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [name=" + name + ", brand=" + brand + ",  noOfChocolates=" + noOfChocolates + "]";
	}

	@Override
	public int hashCode() {
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof ChocolateDTO) {
				ChocolateDTO casted = (ChocolateDTO) obj;

				if (name.equals(casted.getName()) && brand.equals(casted.getBrand())) {
					return true;
				}

			}
		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getNoOfChocolates() {
		return noOfChocolates;
	}

	public void setNoOfChocolates(int noOfChocolates) {
			this.noOfChocolates = noOfChocolates;
	}
}
