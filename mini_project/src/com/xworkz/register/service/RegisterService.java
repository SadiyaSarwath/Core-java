package com.xworkz.register.service;

import com.xworkz.register.dto.RegisterEntity;

public interface RegisterService {
	boolean validateAndSave(RegisterEntity registerEntity);
}
