package com.xworkz.tour.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
@Entity
@Table(name = "product_details")
@NamedQueries(value = { @NamedQuery(name = "getAll", query = "select p from ProductEntity p"),
		@NamedQuery(name = "getBypriceGreaterThan", query = "select p.price from ProductEntity p where p.price >:cutoffprice"),
		@NamedQuery(name = "getBypriceLesserThan", query = "select p.price from ProductEntity p where p.price <:cutoffprice"),
		@NamedQuery(name = "getByNameAndId", query = "select p from ProductEntity as p where p.name=:setname and p.id=:setid"),
		@NamedQuery(name = "getTotalNames", query = "select p.name from ProductEntity as p"),
		@NamedQuery(name = "getMaxPrice", query = "select max(p.price) from ProductEntity as p"),
		@NamedQuery(name = "getTotalPrice", query = "select sum(p.price) from ProductEntity as p"),
		@NamedQuery(name = "getQuantityByName", query = "select p.quantity from ProductEntity as p where p.name=:setname"),
		@NamedQuery(name = "getQuantityAndPriceByName", query = "select p.quantity,p.price from ProductEntity as p  where p.name=:setname"),
		@NamedQuery(name = "getQuantityAndPriceByNameAndId", query = "select p.quantity,p.price from ProductEntity as p where p.name=:setname and p.id=:setid"),
		@NamedQuery(name = "getByBrand", query = "select p.brand from ProductEntity as p where p.brand=:setbrand"),
		@NamedQuery(name = "getBrand", query = "select p.brand from ProductEntity as p where p.name=:setname"),
		@NamedQuery(name = "getNameAndPriceByBrand", query = "select p.name,p.price from ProductEntity p where p.brand=:setbrand"),
		@NamedQuery(name = "getNameAndPrice", query = "select p.name,p.price from ProductEntity p ") })
public class ProductEntity implements Serializable {
	@Id
	@Column(name = "pid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "p_name")
	private String name;
	@Column(name = "p_quantity")
	private int quantity;
	@Column(name = "p_brand")
	private String brand;
	@Column(name = "p_price")
	private float price;
	@Column(name = "p_rating")
	private float rating;

	public ProductEntity(String name, int quantity, String brand, float price, float rating) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.brand = brand;
		this.price = price;
		this.rating = rating;
	}

}
