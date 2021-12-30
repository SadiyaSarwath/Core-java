package com.xworkz.db.dto;

public class CityDTO {
	private int cid;
	private String cname;
	private String population;
	private String famousfor;

	public CityDTO() {

	}

	public CityDTO(int cid, String cname, String population, String famousfor) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.population = population;
		this.famousfor = famousfor;
	}

	@Override
	public String toString() {
		return "CityDTO [cid=" + cid + ", cname=" + cname + ", population=" + population + ", famousfor=" + famousfor
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getCid() {
		return cid;
	}

	public String getCname() {
		return cname;
	}

	public String getPopulation() {
		return population;
	}

	public String getFamousfor() {
		return famousfor;
	}

}
