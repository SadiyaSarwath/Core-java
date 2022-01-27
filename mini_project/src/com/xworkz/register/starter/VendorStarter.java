package com.xworkz.register.starter;

import java.time.LocalDateTime;

import com.xworkz.register.dao.VendorDAO;
import com.xworkz.register.dao.VendorDAOImpl;
import com.xworkz.register.dto.VendorEntity;
import com.xworkz.register.service.VendorService;
import com.xworkz.register.service.VendorServiceImpl;

public class VendorStarter {

	public static void main(String[] args) {
		VendorEntity vendorEntity = new VendorEntity("sadiya", "sadiya172@gmail.com", "saddy1708", "sadiya@17",
				"#61/25,2nd cross, 9th A Main BTM Layout 1st Stage", "GST1729937N", "Sadiya", LocalDateTime.now(),
				"Sadiya", LocalDateTime.now());
		VendorEntity vendorEntity1 = new VendorEntity("kulsum", "kulsum2783@gmail.com", "umme23", "kulsum@23",
				"#61/25,2nd cross, BTM Layout 1st Stage", "GST124729937N", "Sadiya", LocalDateTime.now(), "Sadiya",
				LocalDateTime.now());
		VendorEntity vendorEntity2 = new VendorEntity("uzma", "uzma1y787@gmail.com", "salma3849", "salma@1173",
				"#674,2nd cross, kormangala", "GST177550NTT", "Sadiya", LocalDateTime.now(), "Sadiya",
				LocalDateTime.now());
		VendorEntity vendorEntity3 = new VendorEntity("zunaira", "zunira56788@gmail.com", "zunni467448", "Zunaira008",
				"#6484,8 th Main road, Murgeshpalaya", "GST378399MTTT", "Sadiya", LocalDateTime.now(), "Sadiya",
				LocalDateTime.now());
		VendorEntity vendorEntity4 = new VendorEntity("madiha", "madihajunaid@gmail.com", "hafsa647484", "mannan@13",
				"#61, electronic city phase 1", "GST17299398497N", "Sadiya", LocalDateTime.now(), "Sadiya",
				LocalDateTime.now());
		VendorDAO dao = new VendorDAOImpl();
		VendorService vs = new VendorServiceImpl(dao);
		vs.validateAndSave(vendorEntity);
		vs.validateAndSave(vendorEntity4);
		vs.validateAndSave(vendorEntity2);
		vs.validateAndSave(vendorEntity1);
		vs.validateAndSave(vendorEntity3);
	}

}
