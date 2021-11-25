package com.xworkz.java.bus;

public class BusRouteAssociation {
	BusRouteInterface dao;

	public BusRouteAssociation(BusRouteInterface dao) {
		super();
		this.dao = dao;

	}

	public void saveBus(BusRouteDTO dto) {
		if (dto != null && dao.saveBusData(dto)) {
			System.out.println("invoked saveBusData");

		} else {
			System.err.println("dto is pointing to null");
		}

	}

	public void getDriverName(BusRouteDTO dto) {
		if (dto != null) {
			System.out.println(dto.getDriverName());
		}

	}

	public void displayDetails() {
		if (dao != null) {
			dao.displayBusDetails();
		}
	}

}
