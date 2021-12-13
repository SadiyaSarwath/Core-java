package com.xworkz.groups.dto;

public class HospitalDTO {

	private String name, location;
	private int noOfDoctors;

	public HospitalDTO(String name, String location, int noOfDoctors) {
		super();
		this.name = name;
		this.location = location;
		this.noOfDoctors = noOfDoctors;
	}

	@Override
	public String toString() {
		return "HospitalDTO [name=" + name + ", location=" + location + ", noOfDoctors=" + noOfDoctors + "]";
	}

	@Override
	public int hashCode() {
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof HospitalDTO) {
				HospitalDTO casted = (HospitalDTO) obj;

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

	public int getNoOfDoctors() {
		return noOfDoctors;
	}

	public void setNoOfDoctors(int noOfDoctors) {
		this.noOfDoctors = noOfDoctors;
	}

}
