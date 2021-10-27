package com.xworkz.dp.dto;

public class DoctorDTO {
	private String name;
	private String specilization;
	private String hospitalName;
	private char gender;
	private float salary;

	public DoctorDTO() {

	}

	public DoctorDTO(String name, String specilization, String hospitalName, char gender, float salary) {
		super();
		this.name = name;
		this.specilization = specilization;
		this.hospitalName = hospitalName;
		this.gender = gender;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecilization() {
		return specilization;
	}

	public void setSpecilization(String specilization) {
		this.specilization = specilization;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}

}
