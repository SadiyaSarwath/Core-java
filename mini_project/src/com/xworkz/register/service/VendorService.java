package com.xworkz.register.service;

import com.xworkz.register.dto.VendorEntity;

public interface VendorService {
	public boolean validateAndSave(VendorEntity vendorEntity);
}
