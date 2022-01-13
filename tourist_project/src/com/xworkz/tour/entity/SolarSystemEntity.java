package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "solarSystem_details")
public class SolarSystemEntity {
	@Id
	@Column(name = "sid")
	private int id;
	@Column(name = "s_company")
	private String company;
	@Column(name = "s_liter")
	private int liter;
	@Column(name = "s_noOfTube")
	private int noOfTube;
	@Column(name = "s_price")
	private int price;

	public SolarSystemEntity() {

	}

	public SolarSystemEntity(int id, String company, int liter, int noOfTube, int price) {
		super();
		this.id = id;
		this.company = company;
		this.liter = liter;
		this.noOfTube = noOfTube;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public int getLiter() {
		return liter;
	}

	public void setLiter(int liter) {
		this.liter = liter;
	}

	public int getNoOfTube() {
		return noOfTube;
	}

	public void setNoOfTube(int noOfTube) {
		this.noOfTube = noOfTube;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "SolarSystemEntity [id=" + id + ", company=" + company + ", liter=" + liter + ", noOfTube=" + noOfTube
				+ ", price=" + price + "]";
	}
}
