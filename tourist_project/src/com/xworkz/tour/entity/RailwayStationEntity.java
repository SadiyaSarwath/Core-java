package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "railway_details")
public class RailwayStationEntity {
	@Id
	@Column(name = "r_id")
	private int id;
	@Column(name = "r_name")
	private String name;
	@Column(name = "r_location")
	private String location;
	@Column(name = "r_noOfPlatform")
	private int noOfPlatform;
	@Column(name = "r_cityName")
	private String cityName;

	public RailwayStationEntity() {

	}

	public RailwayStationEntity(int id, String name, String location, int noOfPlatform, String cityName) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.noOfPlatform = noOfPlatform;
		this.cityName = cityName;
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

	public int getNoOfPlatform() {
		return noOfPlatform;
	}

	public void setNoOfPlatform(int noOfPlatform) {
		this.noOfPlatform = noOfPlatform;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "RailwayStationEntity [id=" + id + ", name=" + name + ", location=" + location + ", noOfPlatform="
				+ noOfPlatform + ", cityName=" + cityName + "]";
	}
}
