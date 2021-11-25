package com.xworkz.java.bus;

public class BusRouteRunner {

	public static void main(String[] args) {
		BusRouteDTO ref1 = new BusRouteDTO("As17", "Mico layout", "Kormangala", "Pavan");
		BusRouteInterface ref2 = new BusRouteImplementation();
		BusRouteAssociation ref3 = new BusRouteAssociation(ref2);
		ref3.saveBus(ref1);
		ref3.getDriverName(ref1);
		ref3.displayDetails();

	}

}
