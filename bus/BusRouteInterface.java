package com.xworkz.java.bus;

public interface BusRouteInterface {
	boolean saveBusData(BusRouteDTO dto);

	BusRouteDTO findDriverName(String name);

	void displayBusDetails();

}
