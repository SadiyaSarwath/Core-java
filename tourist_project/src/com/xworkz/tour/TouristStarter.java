package com.xworkz.tour;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.xworkz.tour.dao.TouristDAO;
import com.xworkz.tour.dao.TouristDAOImpl;
import com.xworkz.tour.entity.TouristEntity;

public class TouristStarter {
	public static void main(String[] args) {
		// EntityManagerFactory entityManagerFactory =
		// Persistence.createEntityManagerFactory("com.xworkz.tour");
		// System.out.println(entityManagerFactory);
		TouristEntity te = new TouristEntity(1, "mysore", 800, "mysore palace", 75, "spring");
		TouristDAO dao = new TouristDAOImpl();
		dao.put(te);
	}
}
