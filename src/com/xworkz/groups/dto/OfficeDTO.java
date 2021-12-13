package com.xworkz.groups.dto;

public class OfficeDTO {

	private String name, location;
	private int noOfStaffs;

	public OfficeDTO(String name, String location, int noOfStaffs) {
		super();
		this.name = name;
		this.location = location;

		this.noOfStaffs = noOfStaffs;
	}

	@Override
	public String toString() {
		return "OfficeDTO [name=" + name + ", location=" + location + ", noOfStaffs="
				+ noOfStaffs + "]";
	}

	@Override
	public int hashCode() {
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof OfficeDTO) {
				OfficeDTO casted = (OfficeDTO) obj;

				if (name.equals(casted.getName()) && location.equals(casted.getLocation())) {
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}
}
