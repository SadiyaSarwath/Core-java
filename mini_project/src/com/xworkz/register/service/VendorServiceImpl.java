package com.xworkz.register.service;

import com.xworkz.register.dao.VendorDAO;
import com.xworkz.register.dao.VendorDAOImpl;
import com.xworkz.register.dto.VendorEntity;

public class VendorServiceImpl implements VendorService {
	private VendorDAO dao;

	public VendorServiceImpl(VendorDAO vendorDAO) {
		this.dao = vendorDAO;
	}

	@Override
	public boolean validateAndSave(VendorEntity vendorEntity) {
		boolean valid = true;
		if ((vendorEntity.getVname() != null && vendorEntity.getVname().length() >= 5)
				&& vendorEntity.getVname().length() <= 30 && !(vendorEntity.getVname().isEmpty())) {
			valid = true;
			System.out.println("VendorName is valid");
		} else {
			System.out.println("VendorName is invalid");
			System.out.println(vendorEntity.getVname().length());
			valid = false;
			return valid;
		}
		if ((vendorEntity.getEmail() != null && vendorEntity.getEmail().contains("@")
				&& vendorEntity.getEmail().length() >= 3) && vendorEntity.getEmail().length() <= 30
				&& !(vendorEntity.getEmail().isEmpty()) && vendorEntity.getEmail().endsWith(".com")
				|| vendorEntity.getEmail().endsWith(".in") || vendorEntity.getEmail().endsWith(".org")) {
			valid = true;
			System.out.println("EmailId is valid");
		} else {
			System.out.println("EmailId is invalid");
			System.out.println(vendorEntity.getEmail().length());
			valid = false;
			return valid;
		}

		if ((vendorEntity.getLoginName() != null && vendorEntity.getLoginName().length() >= 8)
				&& vendorEntity.getLoginName().length() <= 12 && !(vendorEntity.getLoginName().isEmpty())) {
			valid = true;
			System.out.println("LoginName is valid");
		} else {
			System.out.println("LoginName is invalid");
			System.out.println(vendorEntity.getLoginName().length());
			valid = false;
			return valid;
		}
		if ((vendorEntity.getPassword() != null && vendorEntity.getPassword().length() >= 8)
				&& vendorEntity.getPassword().length() <= 36 && !(vendorEntity.getPassword().isEmpty())) {
			valid = true;
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
			System.out.println(vendorEntity.getPassword().length());
			valid = false;
			return valid;
		}
		if ((vendorEntity.getAddress() != null && vendorEntity.getAddress().length() >= 30)
				&& vendorEntity.getAddress().length() <= 100 && !(vendorEntity.getAddress().isEmpty())) {
			valid = true;
			System.out.println("Address is valid");
		} else {
			System.out.println("Address is invalid");
			System.out.println(vendorEntity.getAddress().length());
			valid = false;
			return valid;
		}
		if ((vendorEntity.getGstNo() != null && vendorEntity.getGstNo().length() == 13)
				&& !(vendorEntity.getGstNo().isEmpty())) {
			valid = true;
			System.out.println("GstNo is valid");
		} else {
			System.out.println("GstNo is invalid");
			System.out.println(vendorEntity.getGstNo().length());
			valid = false;
			return valid;
		}
		if ((vendorEntity.getCreatedBy() != null && vendorEntity.getCreatedBy().length() >= 5)
				&& vendorEntity.getCreatedBy().length() <= 30 && !(vendorEntity.getCreatedBy().isEmpty())) {
			valid = true;

		} else {
			System.out.println("CreatedBy is invalid");
			System.out.println(vendorEntity.getCreatedBy().length());
			valid = false;
			return valid;
		}
		if ((vendorEntity.getCreatedAt() != null)) {
			valid = true;

		} else {
			System.out.println("CreatedAt is invalid");

			valid = false;
			return valid;
		}
		if ((vendorEntity.getUpdatedBy() != null && vendorEntity.getUpdatedBy().length() >= 5)
				&& vendorEntity.getUpdatedBy().length() <= 30 && !(vendorEntity.getUpdatedBy().isEmpty())) {
			valid = true;

		} else {
			System.out.println("UpdatedBy is invalid");
			System.out.println(vendorEntity.getCreatedBy().length());
			valid = false;
			return valid;
		}
		if ((vendorEntity.getUpdatedAt() != null)) {
			valid = true;

		} else {
			System.out.println("UpdatedAt is invalid");

			valid = false;
			return valid;
		}

		if (valid) {
			dao.save(vendorEntity);

		}

		return false;
	}

}
