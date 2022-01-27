package com.xworkz.tour.dao;

import java.util.List;

import com.xworkz.tour.entity.ProductEntity;

public interface ProductDAO {
	void addAll(List<ProductEntity> entities);

	List<ProductEntity> getAll();

	List<Float> getBypriceGreaterThan(Float price);

	List<Float> getBypriceLesserThan(Float price);

	ProductEntity getByNameAndId(String name, int id);

	List<String> getTotalNames();

	float getMaxPrice();

	double getTotalPrice();

	String getByNamelike(String name);

	Object getQuantityByName(String name);

	Object[] getQuantityAndPriceByName(String name);

	Object[] getQuantityAndPriceByNameAndId(String name, int id);

	String getByBrand(String brand);

	List<Object[]> getNameAndPrice();

	String getBrand(String name);

	Object[] getNameAndPriceByBrand(String brand);
}
