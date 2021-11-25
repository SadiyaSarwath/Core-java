package com.xworkz.java.bird;

public class BirdRunner {

	public static void main(String[] args) {
		BirdDTO bird1= new BirdDTO("Pigeon18", "laughingdove", 2, "africa", true);
		BirdInterface bird2= new BirdImplementation();
		BirdAssociation bird3 =new BirdAssociation(bird2);
		bird3.saveBird(bird1);
		bird3.getBirdage(bird1);
		bird3.displayDetails();
		bird3.getId(bird1);
	}

	}


