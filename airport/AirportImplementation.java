package com.xworkz.java.airport;
public class AirportImplementation implements AirportInterface {
	AirportDTO[] dto = new AirportDTO[5];
	int count = 0;

	@Override
	public boolean saveAirportData(AirportDTO airportdto) {
		System.out.println("invoked saveAirportData");
		if (airportdto != null) {
			dto[count++] = airportdto;
			return true;

		} else {
			System.err.println("airport dto is null");
		}
		return false;
	}

	@Override
	public AirportDTO findLocation(String location) {
		System.out.println("invoked findLocation");
		return null;
	}

	@Override
	public void displayAirportDetails() {
		if (dto != null) {

			for (int a = 0; a < dto.length; a++) {

				AirportDTO airportDto = dto[a];
				if (airportDto != null) {
					System.out.println(airportDto.getId());
					System.out.println(airportDto.getLocation());
					System.out.println(airportDto.getName());

				}
			}
		}

	}

}
