package com.xworkz.dp.dto;

public class WalletDTO {
	private String companyName;
	private String material;
	private int totalCompartments;
	private float price;
	private float coinCompartments;

	public WalletDTO() {

	}

	public WalletDTO(String companyName, String material, int totalCompartments, float price, float coinCompartments) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.totalCompartments = totalCompartments;
		this.price = price;
		this.coinCompartments = coinCompartments;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getTotalCompartments() {
		return totalCompartments;
	}

	public void setTotalCompartments(int totalCompartments) {
		this.totalCompartments = totalCompartments;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public float getCoinCompartments() {
		return coinCompartments;
	}

	public void setCoinCompartments(float coinCompartments) {
		this.coinCompartments = coinCompartments;
	}

}
