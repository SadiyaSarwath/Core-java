package com.xworkz.java.bird;

public class BirdDTO {
	private String id;
	private String breed;
	private int age;
	private String origin;
	private boolean canFly;

	public BirdDTO(String id, String breed, int age, String origin, boolean canFly) {
		super();
		this.id = id;
		this.breed = breed;
		this.age = age;
		this.origin = origin;
		this.canFly = canFly;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public boolean isCanFly() {
		return canFly;
	}

	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}

}
