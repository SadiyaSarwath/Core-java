package com.xworkz.dp.dto;

public class IplDTO {
	private int noOfTeams;
	private int noOfCoaches;
	private String ownerName;
	private String teamName;

	public IplDTO() {

	}

	
	public IplDTO(int noOfTeams, int noOfCoaches, String ownerName, String teamName) {
		super();
		this.noOfTeams = noOfTeams;
		this.noOfCoaches = noOfCoaches;
		this.ownerName = ownerName;
		this.teamName = teamName;
	}


		public int getNoOfTeams() {
		return noOfTeams;
	}

	public void setNoOfTeams(int noOfTeams) {
		this.noOfTeams = noOfTeams;
	}

	public int getNoOfCoaches() {
		return noOfCoaches;
	}

	public void setNoOfCoaches(int noOfCoaches) {
		this.noOfCoaches = noOfCoaches;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

}
