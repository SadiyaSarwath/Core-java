package com.xworkz.java.airport;

public class AirportAssociation {
	AirportInterface dao;

	public AirportAssociation(AirportInterface dao) {
		super();
		this.dao = dao;

	}

	public void saveAiport(AirportDTO dto) {
		if (dto != null && dao.saveAirportData(dto)) {
			System.out.println("invoked saveAirportData");

		} else {
			System.err.println("dto is pointing to null");
		}

	}

	public void getLocation(AirportDTO dto) {
		if (dto != null) {
			System.out.println(dto.getLocation());
		}

	}

	public void displayDetails() {
		if (dao != null) {
			dao.displayAirportDetails();
		}
	}

}



