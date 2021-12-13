package com.xworkz.groups.dto;

public class PoliceStationDTO {
	private String name, location, type;
	private int noOfStaffs;

	public PoliceStationDTO(String name, String location, String type, int noOfStaffs) {
		super();
		this.name = name;
		this.location = location;
		this.type = type;
		this.noOfStaffs = noOfStaffs;
	}

	@Override
	public String toString() {
		return "PoliceStationDTO [name=" + name + ", location=" + location + ", type=" + type + ", noOfStaffs="
				+ noOfStaffs + "]";
	}

	@Override
	public int hashCode() {
		return 2;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj != null) {
			if (obj instanceof PoliceStationDTO) {
				PoliceStationDTO casted = (PoliceStationDTO) obj;
				
				if (name.equals(casted.getName()) && location.equals(casted.getLocation()) && type.equals(casted.getType())) {
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getNoOfStaffs() {
		return noOfStaffs;
	}

	public void setNoOfStaffs(int noOfStaffs) {
		this.noOfStaffs = noOfStaffs;
	}

}
