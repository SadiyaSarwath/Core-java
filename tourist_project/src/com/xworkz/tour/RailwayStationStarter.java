package com.xworkz.tour;

import com.xworkz.tour.dao.RailwayStationDAO;
import com.xworkz.tour.dao.RailwayStationDAOImpl;
import com.xworkz.tour.entity.RailwayStationEntity;

public class RailwayStationStarter {
	public static void main(String[] args) {

		RailwayStationEntity entity = new RailwayStationEntity(1, "indianexpress", "csmt", 10, "karnataka");
		RailwayStationDAO dao = new RailwayStationDAOImpl();
		dao.put(entity);

	}
}
