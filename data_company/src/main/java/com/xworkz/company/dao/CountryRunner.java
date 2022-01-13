package com.xworkz.company.dao;

import com.xworkz.company.entity.CountryEntity;

public class CountryRunner {
	public static void main(String[] args) {

		CountryEntity ce = new CountryEntity(1, "dubai", "abu dhabi", 50000);
		CountryEntity ce2 = new CountryEntity(2, "south korea", "seoul", 23000);
		CountryEntity ce3 = new CountryEntity(3, "thailand", "bankgok", 90000);
		CountryEntity ce4 = new CountryEntity(4, "sri lanka", "columbo", 50000);
		CountryEntity ce5 = new CountryEntity(5, "new zealand", "amesterdam", 50000);

		CountryDAO dao = new CountryDAOImpl();
		//dao.create(ce);
		dao.create(ce2);
		dao.create(ce3);
		dao.create(ce4);
		dao.create(ce5);
	}
}
