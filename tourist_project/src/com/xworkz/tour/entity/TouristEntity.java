package com.xworkz.tour.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tourist_table")
public class TouristEntity {
	@Id
	@Column(name = "tid")
	private int id;
	@Column(name = "t_location")
	private String location;
	@Column(name = "seaLevel")
	private float seaLevel;
	@Column(name = "famousFor")
	private String famousFor;
	@Column(name = "entryFee")
	private int entryFee;
	@Column(name = "season")
	private String season;

	public TouristEntity() {

	}

	public TouristEntity(int id, String location, float seaLevel, String famousFor, int entryFee, String season) {
		super();
		this.id = id;
		this.location = location;
		this.seaLevel = seaLevel;
		this.famousFor = famousFor;
		this.entryFee = entryFee;
		this.season = season;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public float getSeaLevel() {
		return seaLevel;
	}

	public void setSeaLevel(float seaLevel) {
		this.seaLevel = seaLevel;
	}

	public String getFamousFor() {
		return famousFor;
	}

	public void setFamousFor(String famousFor) {
		this.famousFor = famousFor;
	}

	public int getEntryFee() {
		return entryFee;
	}

	public void setEntryFee(int entryFee) {
		this.entryFee = entryFee;
	}

	public String getSeason() {
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}

	@Override
	public String toString() {
		return "TouristEntity [id=" + id + ", location=" + location + ", seaLevel=" + seaLevel + ", famousFor="
				+ famousFor + ", entryFee=" + entryFee + ", season=" + season + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + Float.floatToIntBits(seaLevel);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TouristEntity other = (TouristEntity) obj;
		if (id != other.id)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (Float.floatToIntBits(seaLevel) != Float.floatToIntBits(other.seaLevel))
			return false;
		return true;
	}

}
