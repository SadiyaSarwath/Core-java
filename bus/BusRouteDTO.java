package com.xworkz.java.bus;

public class BusRouteDTO {
	private String id;
	private String startPoint;
	private String destination;
	private String driverName;

	public BusRouteDTO(String id, String startPoint, String destination, String driverName) {
		super();
		this.id = id;
		this.startPoint = startPoint;
		this.destination = destination;
		this.driverName = driverName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStartPoint() {
		return startPoint;
	}

	public void setStartPoint(String startPoint) {
		this.startPoint = startPoint;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

}
