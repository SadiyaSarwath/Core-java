package com.xworkz.company.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "statedetails")
public class StateEntity implements Serializable {
	@Id
	@Column(name = "stateid")
	private int id;
	@Column(name = "state_name")
	private String name;
	@Column(name = "noOfdistricts")
	private int noIfDistricts;
	@Column(name = "capitalCity")
	private String capitalCity;

	public StateEntity() {

	}

	public StateEntity(int id, String name, int noIfDistricts, String capitalCity) {
		super();
		this.id = id;
		this.name = name;
		this.noIfDistricts = noIfDistricts;
		this.capitalCity = capitalCity;
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

	public int getNoIfDistricts() {
		return noIfDistricts;
	}

	public void setNoIfDistricts(int noIfDistricts) {
		this.noIfDistricts = noIfDistricts;
	}

	public String getCapitalCity() {
		return capitalCity;
	}

	public void setCapitalCity(String capitalCity) {
		this.capitalCity = capitalCity;
	}

	@Override
	public String toString() {
		return "StateEntity [id=" + id + ", name=" + name + ", noIfDistricts=" + noIfDistricts + ", capitalCity="
				+ capitalCity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		StateEntity other = (StateEntity) obj;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
