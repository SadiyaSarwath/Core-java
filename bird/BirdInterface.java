package com.xworkz.java.bird;

public interface BirdInterface {
	boolean saveBirdData(BirdDTO dto);

	BirdDTO findAge(int age);

	void displayBirdDetails();

}
