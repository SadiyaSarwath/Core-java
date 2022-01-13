package com.xworkz.tour;

import com.xworkz.tour.dao.SilManufactureDAO;
import com.xworkz.tour.dao.SilkManufactureDAOImpl;
import com.xworkz.tour.entity.SilkManufactureEntity;

public class SilkManufactureStater {
	public static void main(String[] args) {

		SilkManufactureEntity entity = new SilkManufactureEntity(11, "peter england", "uk", 80, "winter");

		SilManufactureDAO dao = new SilkManufactureDAOImpl();
		dao.put(entity);

	}
}
