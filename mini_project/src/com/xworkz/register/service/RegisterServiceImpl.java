package com.xworkz.register.service;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.dto.RegisterEntity;

public class RegisterServiceImpl implements RegisterService {
	private RegisterDAO dao;

	public RegisterServiceImpl(RegisterDAO registerDAO) {
		this.dao = registerDAO;
	}

	@Override
	public boolean validateAndSave(RegisterEntity registerEntity) {
		boolean valid = true;
		if ((registerEntity.getUsername() != null && registerEntity.getUsername().length() >= 6)
				&& registerEntity.getUsername().length() <= 25 && !(registerEntity.getUsername().isEmpty())) {
			valid = true;
			System.out.println("UserName is valid");
		} else {
			System.out.println("UserName is invalid");
			System.out.println(registerEntity.getUsername().length());
			valid = false;
			return valid;
		}
		if ((registerEntity.getEmail() != null && registerEntity.getEmail().contains("@") && registerEntity.getEmail().length() >= 3)
				&& registerEntity.getEmail().length() <= 30 && !(registerEntity.getEmail().isEmpty())
				&& registerEntity.getEmail().endsWith(".com") || registerEntity.getEmail().endsWith(".in") ) {
			valid = true;
			System.out.println("EmailId is valid");
		} else {
			System.out.println("EmailId is invalid");
			System.out.println(registerEntity.getEmail().length());
			valid = false;
			return valid;
		}
		if ((registerEntity.getPassword() != null && registerEntity.getPassword().length() >= 8)
				&& registerEntity.getUsername().length() <= 36 && !(registerEntity.getPassword().isEmpty())) {
			valid = true;
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
			System.out.println(registerEntity.getUsername().length());
			valid = false;
			return valid;
		}

		if (String.valueOf(registerEntity.getMobileNo()).length() == 10) {
			valid = true;
			System.out.println("MobileNo is valid");
		} else {
			System.out.println("MobileNo is invalid");

			valid = false;
			return valid;
		}

		if ((registerEntity.getCity() != null && registerEntity.getCity().length() >= 3)
				&& registerEntity.getCity().length() <= 56 && !(registerEntity.getCity().isEmpty())) {
			valid = true;
			System.out.println("City name is valid");
		} else {
			System.out.println("City name is invalid");
			System.out.println(registerEntity.getCity().length());
			valid = false;
			return valid;
		}
		if ((registerEntity.getCountry() != null && registerEntity.getCountry().length() >= 3)
				&& registerEntity.getCountry().length() <= 56 && !(registerEntity.getCountry().isEmpty())) {
			valid = true;
			System.out.println("Country name is valid");
		} else {
			System.out.println("Country name is invalid");
			System.out.println(registerEntity.getCountry().length());
			valid = false;
			return valid;
		}
		if (valid) {
			dao.save(registerEntity);

		}
		return false;
	}

}
