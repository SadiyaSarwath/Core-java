package com.xworkz.java.bus;


public class BusRouteImplementation implements BusRouteInterface {
	BusRouteDTO[] dto = new BusRouteDTO[5];
	int count = 0;

	@Override
	public boolean saveBusData(BusRouteDTO busdto) {
		System.out.println("invoked saveBusData");
		if (busdto != null) {
			dto[count++] = busdto;
			return true;

		} else {
			System.err.println("bus dto is null");
		}
		return false;
	}

	@Override
	public BusRouteDTO findDriverName(String name) {
		System.out.println("invoked findDriverName");
		return null;
	}

	@Override
	public void displayBusDetails() {
		if (dto != null) {

			for (int b = 0; b < dto.length; b++) {

				BusRouteDTO busDto = dto[b];
				if (busDto != null) {
					System.out.println(busDto.getId());
					System.out.println(busDto.getStartPoint());
					System.out.println(busDto.getDestination());
					System.out.println(busDto.getDriverName());

				}
			}
		}

	}

}
