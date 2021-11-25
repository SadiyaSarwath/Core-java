package com.xworkz.java.airport;

public class AirportRunner {
	public static void main(String[] args) {
		AirportDTO ref1 = new AirportDTO("BHSA2345", "saddy", "India");
		AirportInterface ref2 = new AirportImplementation();
		AirportAssociation ref3 = new AirportAssociation(ref2);
		ref3.saveAiport(ref1);
		ref3.getLocation(ref1);
		ref3.displayDetails();

	}

}
