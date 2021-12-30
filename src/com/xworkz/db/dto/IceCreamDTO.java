package com.xworkz.db.dto;

public class IceCreamDTO {
	private int idIce;
	private String cflavour;
	private String cname;
	private int cprice;

	public IceCreamDTO() {

	}

	public IceCreamDTO(int idIce, String cflavour, String cname, int cprice) {
		super();
		this.idIce = idIce;
		this.cflavour = cflavour;
		this.cname = cname;
		this.cprice = cprice;
	}

	@Override
	public String toString() {
		return "IceCreamDTO [idIce=" + idIce + ", cflavour=" + cflavour + ", cname=" + cname + ", cprice=" + cprice
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public int getIdIce() {
		return idIce;
	}

	public String getCflavour() {
		return cflavour;
	}

	public String getCname() {
		return cname;
	}

	public int getCprice() {
		return cprice;
	}

}
