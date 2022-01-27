package com.xworkz.tour;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.tour.dao.ProductDAO;
import com.xworkz.tour.dao.ProductDAOImpl;
import com.xworkz.tour.entity.ProductEntity;

public class ProductStarter {

	public static void main(String[] args) {
		ProductEntity entity = new ProductEntity("Headphone", 2, "boat", 5000f, 9.5f);

		List<ProductEntity> list = new ArrayList<ProductEntity>();

		ProductDAO dao = new ProductDAOImpl();
		
		list.add(entity);
		list.add(new ProductEntity("Mobile", 1, "Realme", 14000f, 8.0f));
		list.add(new ProductEntity("Pullover", 4, "addidas", 1000f, 10f));
		list.add(new ProductEntity("Speaker", 2, "Sony", 55000f, 7f));
		list.add(new ProductEntity("Powerbank", 2, "redmi", 1500f, 8f));
		list.add(new ProductEntity("TV", 1, "samsung", 15000f, 5.6f));
		list.add(new ProductEntity("Gown", 1, "velvet", 1000f, 8.5f));
		list.add(new ProductEntity("Bag", 5, "wildcraft", 2500f, 8f));
		list.add(new ProductEntity("Eraser", 10, "doms", 100f, 7f));
		list.add(new ProductEntity("Deskstop", 7, "Apple", 200000f, 7.5f));
		list.add(new ProductEntity("Lipstick", 10, "huda beauty", 750f, 10f));
		list.add(new ProductEntity("Watch", 2, "fossil", 50000f, 9.8f));
		list.add(new ProductEntity("Tiffinbox", 5, "milton", 500f, 6.4f));
		list.add(new ProductEntity("Perfume", 3, "yardley london", 700f, 7.5f));
		list.add(new ProductEntity("Shoe", 2, "ducati", 3000f, 8.5f));
		list.add(new ProductEntity("Pencil", 15, "Apsara", 5f, 7.5f));
		
		dao.addAll(list);
		
		dao.getAll();
		System.out.println(dao);

		System.out.println(dao.getBypriceGreaterThan(1000f));

		System.out.println(dao.getBypriceLesserThan(1000f));
		
		System.out.println(dao.getByNameAndId("Watch",12));
		
		System.out.println(dao.getTotalNames());
		
		System.out.println(dao.getMaxPrice());
		
		System.out.println(dao.getTotalPrice());
		
		System.out.println(dao.getQuantityByName("pencil"));
		
		System.out.println(dao.getQuantityAndPriceByName("Pencil"));
		
		System.out.println(dao.getQuantityAndPriceByNameAndId("bag", 8));
		
		System.out.println(dao.getByBrand("fossil"));
		
		System.out.println(dao.getBrand("apple"));
		
		System.out.println(dao.getNameAndPriceByBrand("Shoe"));
		
		System.out.println(dao.getNameAndPrice());

		

	

	}
}
