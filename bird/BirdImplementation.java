package com.xworkz.java.bird;

public class BirdImplementation implements BirdInterface {

	BirdDTO[] dto = new BirdDTO[5];
	int counter = 0;

	@Override
	public boolean saveBirdData(BirdDTO birddto) {
		System.out.println("invoked saveBirdData");
		if (birddto != null) {
			dto[counter++] = birddto;
			return true;

		} else {
			System.err.println("bird dto is null");
		}

		return false;
	}

	@Override
	public BirdDTO findAge(int age) {
		System.out.println("invoked findAge");
		if (dto != null) {

			for (int b = 0; b < dto.length; b++) {
				BirdDTO ref = dto[b];
				if (ref != null) {

					int age1 = ref.getAge();
					
					if (age == age1) {
						System.out.println("bird age is found");
					} else {
						System.err.println("bird age is not found");
					}

				} else {
					System.err.println("ref of dto is pointing to null");
				}
			}
		} else {
			System.err.println("dto is pointing to null");
		}
		return null;
	}

	@Override
	public void displayBirdDetails() {
		if (dto != null) {

			for (int b = 0; b < dto.length; b++) {

				BirdDTO birdDto = dto[b];
				if (birdDto != null) {
					System.out.println(birdDto.getAge());
					System.out.println(birdDto.getBreed());
					System.out.println(birdDto.getId());
					System.out.println(birdDto.getOrigin());
					System.out.println(birdDto.isCanFly());

				}
			}
		}

	}
}
