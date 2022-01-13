package com.xworkz.tour;

import com.xworkz.tour.dao.SolarSystemDAO;
import com.xworkz.tour.dao.SolarSystemDAOImpl;
import com.xworkz.tour.entity.SolarSystemEntity;

public class SolarSystemStarter {
	public static void main(String[] args) {

		SolarSystemEntity entity = new SolarSystemEntity(22, "laxmi", 250, 24, 22000);
		
		SolarSystemDAO dao = new SolarSystemDAOImpl();
		dao.put(entity);
		
	}
}
