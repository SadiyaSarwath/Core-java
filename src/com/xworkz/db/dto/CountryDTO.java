package com.xworkz.db.dto;

public class CountryDTO {
	private int cid;
	private String name;
	private int ccode;
	private String continent;

	public CountryDTO() {

	}

	public CountryDTO(int cid, String name, int ccode, String continent) {
		super();
		this.cid = cid;
		this.name = name;
		this.ccode = ccode;
		this.continent = continent;
	}

	@Override
	public String toString() {
		return "CountryDTO [cid=" + cid + ", name=" + name + ", ccode=" + ccode + ", continent=" + continent
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getCid() {
		return cid;
	}

	public String getName() {
		return name;
	}

	public int getCcode() {
		return ccode;
	}

	public String getContinent() {
		return continent;
	}

}
