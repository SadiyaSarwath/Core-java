package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "silk_details")
public class SilkManufactureEntity {
	@Id
	@Column(name = "s_id")
	private int id;
	@Column(name = "s_name")
	private String name;
	@Column(name = "s_location")
	private String location;
	@Column(name = "s_perQuality")
	private int per_quantity;
	@Column(name = "s_season")
	private String season;

	public SilkManufactureEntity() {

	}

	public SilkManufactureEntity(int id, String name, String location, int per_quantity, String season) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.per_quantity = per_quantity;
		this.season = season;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPer_quantity() {
		return per_quantity;
	}

	public void setPer_quantity(int per_quantity) {
		this.per_quantity = per_quantity;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "SilkManufactureEntity [id=" + id + ", name=" + name + ", location=" + location + ", per_quantity="
				+ per_quantity + ", season=" + season + "]";
	}
}
