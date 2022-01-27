package com.xworkz.shop.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sc_details")
public class SportsShopEntity implements Serializable {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "firstname")
	private String firstname;
	@Column(name = "lastname")
	private String lastname;
	@Column(name = "password")
	private String password;
	@Column(name = "confirm_password")
	private String confirmPassword;
	@Column(name = "address")
	private String address;
	@Column(name = "phoneNo")
	private long phoneNo;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "age")
	private int age;
	@Column(name = "pincode")
	private int pincode;
	@Column(name = "createdBy")
	private String createdBy;
	@Column(name = "createdAt")
	private LocalDateTime createdAt;
	@Column(name = "updatedBy")
	private String updatedBy;
	@Column(name = "updatedAt")
	private LocalDateTime updatedAt;

	public SportsShopEntity(String firstname, String lastname, String password, String confirmPassword, String address,
			long phoneNo, String emailId, int age, int pincode, String createdBy, LocalDateTime createdAt,
			String updatedBy, LocalDateTime updatedAt) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.address = address;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
		this.age = age;
		this.pincode = pincode;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

}
