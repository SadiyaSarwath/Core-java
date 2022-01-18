package com.xworkz.tour.entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="biscuit_details")
public class BiscuitEntity {
	@Id
	@Column (name="b_id")
	private int id;
	@Column (name="b_name")
	private String name;
	@Column (name="b_company")
	private String company;
	@Column (name="b_colour")
	private String colour;
	@Column (name="b_price")
	private int price;
	public BiscuitEntity() {
		
	}
	public BiscuitEntity(int id, String name, String company, String colour, int price) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.colour = colour;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "BiscuitEntity [id=" + id + ", name=" + name + ", company=" + company + ", colour=" + colour + ", price="
				+ price + "]";
	}

}

