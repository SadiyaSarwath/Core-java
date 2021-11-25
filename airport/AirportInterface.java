package com.xworkz.java.airport;

public interface AirportInterface {
	boolean saveAirportData(AirportDTO dto);

	AirportDTO findLocation(String location);

	void displayAirportDetails();

}
