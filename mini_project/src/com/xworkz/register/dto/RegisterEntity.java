package com.xworkz.register.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "registeration_details")
public class RegisterEntity implements Serializable {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "username")
	private String username;
	@Column(name = "email")
	private String email;
	@Column(name = "password")
	private String password;
	@Column(name = "city")
	private String city;
	@Column(name = "country")
	private String country;
	@Column(name = "mobileNo")
	private long mobileNo;
	@Column(name = "indianCitizen")
	private boolean indianCitizen;

	public RegisterEntity(String username, String email, String password, String city, String country, long mobileNo,
			boolean indianCitizen) {
		super();
		this.username = username;
		this.email = email;
		this.password = password;
		this.city = city;
		this.country = country;
		this.mobileNo = mobileNo;
		this.indianCitizen = indianCitizen;
	}

}
