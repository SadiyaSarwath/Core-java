package com.xworkz.register.starter;

import com.xworkz.register.dao.RegisterDAO;
import com.xworkz.register.dao.RegisterDAOImpl;
import com.xworkz.register.dto.RegisterEntity;
import com.xworkz.register.service.RegisterService;
import com.xworkz.register.service.RegisterServiceImpl;

public class RegisterStarter {
	public static void main(String[] args) {
		RegisterEntity registerEntity = new RegisterEntity("sadiya", "sadi17@gmail.com", "sad@17", "Bangalore",
				"India", 9916113208l, true);
		RegisterEntity registerEntity1 = new RegisterEntity("sarwath", "sadiyasarwath17@gmail.com", "sadi@17", "Dubai",
				"Saudi Arabia", 9916110977l, false);
		RegisterEntity registerEntity2 = new RegisterEntity("savitha", "savitha1829@gmail.com", "savitha@1829",
				"Amsterdam", "Australia", 9742823657l, false);
		RegisterEntity registerEntity3 = new RegisterEntity("sabaAhmed", "saba14@gmail.com", "ahmed@14", "Paris", "New york",
				63198753002l, false);
		RegisterEntity registerEntity4 = new RegisterEntity("abhaKumari", "abhakumari@gmail", "abhakumari@21", "Sarjapur",
				"India", 88849637720l, true);
		RegisterEntity registerEntity5 = new RegisterEntity("diana", "dianamaria@gmail.com", "diana@27", "Goa", "India",
				989632265541l, true);
		RegisterDAO dao = new RegisterDAOImpl();
		// dao.save(registerEntity);

		RegisterService registerService = new RegisterServiceImpl(dao);
		registerService.validateAndSave(registerEntity);
		registerService.validateAndSave(registerEntity1);
		registerService.validateAndSave(registerEntity2);
		registerService.validateAndSave(registerEntity3);
		registerService.validateAndSave(registerEntity4);
		registerService.validateAndSave(registerEntity5);
	}
}
