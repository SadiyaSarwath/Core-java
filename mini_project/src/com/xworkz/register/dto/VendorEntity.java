package com.xworkz.register.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@AllArgsConstructor
@Entity
@Table(name = "vendor_details")
public class VendorEntity implements Serializable{
	@Id
	@Column(name = "vid")
	private int vid;
	@Column(name = "vname")
	private String vname;
	@Column(name = "email")
	private String email;
	@Column(name = "loginName")
	private String loginName;
	@Column(name = "password")
	private String password;
	@Column(name = "address")
	private String address;
	@Column(name = "gstNo")
	private String gstNo;
	@Column(name = "createdBy")
	private String createdBy;
	@Column(name = "createdAt")
	private LocalDateTime createdAt;
	@Column(name = "updatedBy")
	private String updatedBy;
	@Column(name = "updatedAt")
	private LocalDateTime updatedAt;

	public VendorEntity(String vname, String email, String loginName, String password, String address, String gstNo,
			String createdBy, LocalDateTime createdAt, String updatedBy, LocalDateTime updatedAt) {
		super();
		this.vname = vname;
		this.email = email;
		this.loginName = loginName;
		this.password = password;
		this.address = address;
		this.gstNo = gstNo;
		this.createdBy = createdBy;
		this.createdAt = createdAt;
		this.updatedBy = updatedBy;
		this.updatedAt = updatedAt;
	}

}
