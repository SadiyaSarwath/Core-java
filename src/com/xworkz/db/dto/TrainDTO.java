package com.xworkz.db.dto;

public class TrainDTO {

	private int train_id;
	private int train_no;
	private String boarding;
	private String destination;
	private int train_seat_No;
	private int price;
	private String train_class;
	private String name;

	public TrainDTO(int train_id, int train_no, String boarding, String destination, int train_seat_No, int price,
			String train_class, String name) {
		super();
		this.train_id = train_id;
		this.train_no = train_no;
		this.boarding = boarding;
		this.destination = destination;
		this.train_seat_No = train_seat_No;
		this.price = price;
		this.train_class = train_class;
		this.name = name;
	}

	public int getTrain_id() {
		return train_id;
	}

	@Override
	public String toString() {
		return "TrainDTO [train_id=" + train_id + ", train_no=" + train_no + ", boarding=" + boarding
				+ ", destinaation=" + destination + ", train_seat_No=" + train_seat_No + ", price=" + price
				+ ", train_class=" + train_class + ", name=" + name + "]";
	}

	public void setTrain_id(int train_id) {
		this.train_id = train_id;
	}

	public int getTrain_no() {
		return train_no;
	}

	public void setTrain_no(int train_no) {
		this.train_no = train_no;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getTrain_seat_No() {
		return train_seat_No;
	}

	public void setTrain_seat_No(int train_seat_No) {
		this.train_seat_No = train_seat_No;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getTrain_class() {
		return train_class;
	}

	public void setTrain_class(String train_class) {
		this.train_class = train_class;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
