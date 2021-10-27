package com.xworkz.dp.dto;

public class BraceletDTO {
	private String color;
	private String material;
	private float price;
	private boolean gemused;
	private boolean gifted;

	public BraceletDTO() {
		
	}
	public BraceletDTO(String color, String material, float price, boolean gemused, boolean gifted) {
		super();
		this.color = color;
		this.material = material;
		this.price = price;
		this.gemused = gemused;
		this.gifted = gifted;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public boolean isGemused() {
		return gemused;
	}

	public void setGemused(boolean gemused) {
		this.gemused = gemused;
	}

	public boolean isGifted() {
		return gifted;
	}

	public void setGifted(boolean gifted) {
		this.gifted = gifted;
	}

}
