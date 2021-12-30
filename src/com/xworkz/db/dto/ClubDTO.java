package com.xworkz.db.dto;

public class ClubDTO {
	private int cid;
	private String name;
	private String location;
	private double price;

	public ClubDTO() {

	}

	public ClubDTO(int cid, String name, String location, double price) {
		super();
		this.cid = cid;
		this.name = name;
		this.location = location;
		this.price = price;
	}

	public int getCid() {
		return cid;
	}

	@Override
	public String toString() {
		return "ClubDTO [cid=" + cid + ", name=" + name + ", location=" + location + ", price=" + price + ", getCid()="
				+ getCid() + ", getName()=" + getName() + ", getLocation()=" + getLocation() + ", getPrice()="
				+ getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}

	public String getName() {
		return name;
	}

	public String getLocation() {
		return location;
	}

	public double getPrice() {
		return price;
	}

}
