package com.xworkz.company.dao;

import com.xworkz.company.entity.CityEntity;

public class CityRunner {
	public static void main(String[] args) {

		CityEntity ce = new CityEntity(1, "jaipur", 1002938, "pink city", "green zone");
		CityEntity ce2 = new CityEntity(2, "udaipu", 2002938, "city of lakes", "green zone");
		CityEntity ce3 = new CityEntity(3, "bhopal", 34938, "city of lakes", "green zone");
		CityEntity ce4 = new CityEntity(4, "bangalore", 11002938, "garden city", "red zone");
		CityEntity ce5 = new CityEntity(5, "jhodpur", 2938, "sun city", "green zone");
		CityDAO dao = new CityDAOImpl();
		dao.create(ce);
		dao.create(ce2);
		dao.create(ce3);
		dao.create(ce4);
		dao.create(ce5);
	}
}
