package com.xworkz.shop.sportService;

import java.time.LocalDateTime;

import com.sun.tools.doclint.Entity;
import com.xworkz.shop.dao.SportsShopDAO;
import com.xworkz.shop.dto.SportsShopEntity;

public class SportShopServiceImpl implements SportShopService {
	private SportsShopDAO dao;

	public SportShopServiceImpl(SportsShopDAO sportsDao) {

		this.dao = sportsDao;
	}

	@Override
	public boolean validateAndSave(SportsShopEntity sportEntity) {
		boolean valid = true;
		if ((sportEntity.getFirstname() != null || sportEntity.getFirstname().length() >= 3)
				&& sportEntity.getFirstname().length() <= 300) {
			valid = true;
		} else {
			System.out.println("FirstName is invalid");
			System.out.println(sportEntity.getFirstname().length());
			valid = false;
			return valid;
		}
		if ((sportEntity.getLastname() != null || sportEntity.getLastname().length() >= 3)
				&& sportEntity.getLastname().length() <= 300) {
			valid = true;
		} else {
			System.out.println("LastName is invalid");
			System.out.println(sportEntity.getLastname().length());
			valid = false;
			return valid;
		}

		if ((sportEntity.getPassword() != null || sportEntity.getPassword().length() >= 3)
				&& sportEntity.getPassword().length() <= 300) {
			valid = true;
		} else {
			System.out.println("Password is invalid");
			System.out.println(sportEntity.getPassword().length());
			valid = false;
			return valid;
		}

		if ((sportEntity.getConfirmPassword() != null || sportEntity.getConfirmPassword().length() >= 3)
				&& sportEntity.getConfirmPassword().length() <= 300) {
			valid = true;
		} else {
			System.out.println("ConformPassword is invalid");
			System.out.println(sportEntity.getConfirmPassword().length());
			valid = false;
			return valid;
		}

		if ((sportEntity.getAddress() != null || sportEntity.getAddress().length() >= 3)
				&& sportEntity.getAddress().length() <= 300) {
			valid = true;
		} else {
			System.out.println("Address is invalid");
			System.out.println(sportEntity.getAddress().length());
			valid = false;
			return valid;
		}

		if ((sportEntity.getPhoneNo() != 0 || sportEntity.getPhoneNo() >= 3) && sportEntity.getPhoneNo() <= 300) {
			valid = true;
		} else {
			System.out.println("PhoneNo is invalid");
			System.out.println(sportEntity.getPhoneNo());
			valid = false;
			return valid;
		}

		if ((sportEntity.getEmailId() != null || sportEntity.getEmailId().length() >= 3)
				&& sportEntity.getEmailId().length() <= 300) {
			valid = true;
		} else {
			System.out.println("EmailId is invalid");
			System.out.println(sportEntity.getEmailId().length());
			valid = false;
			return valid;
		}

		if ((sportEntity.getAge() != 0 || sportEntity.getAge() >= 3) && sportEntity.getAge() <= 300) {
			valid = true;
		} else {
			System.out.println("Age is invalid");
			System.out.println(sportEntity.getAge());
			valid = false;
			return valid;
		}

		if ((sportEntity.getPincode() != 0 || sportEntity.getPincode() >= 3) && sportEntity.getPincode() <= 300) {
			valid = true;
		} else {
			System.out.println("Pincode is invalid");
			System.out.println(sportEntity.getPincode());
			valid = false;
			return valid;
		}
		if ((sportEntity.getCreatedBy() != null || sportEntity.getCreatedBy().length() >= 3)
				&& sportEntity.getCreatedBy().length() <= 300) {
			valid = true;
		} else {
			System.out.println("CreatedBy is invalid");
			System.out.println(sportEntity.getCreatedBy().length());
			valid = false;
			return valid;
		}

		if ((sportEntity.getCreatedAt() != null)) {
			valid = true;
		} else {
			System.out.println("CreatedAt is invalid");
			valid = false;
			return valid;
		}
		if ((sportEntity.getUpdatedBy() != null || sportEntity.getUpdatedBy().length() >= 3)
				&& sportEntity.getUpdatedBy().length() <= 300) {
			valid = true;
		} else {
			System.out.println("UpdatedBy is invalid");
			System.out.println(sportEntity.getUpdatedBy().length());
			valid = false;
			return valid;
		}

		if ((sportEntity.getUpdatedAt() != null)) {
			valid = true;
		} else {
			System.out.println("UpdatedAt is invalid");
			valid = false;
			return valid;
		}

		if (valid) {
			dao.save(sportEntity);

		}
		return false;

	}

}
