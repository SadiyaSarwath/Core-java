package com.xworkz.company.dao;

import com.xworkz.company.entity.CompanyEntity;
import com.xworkz.company.dao.CompanyDAOImpl;
import com.xworkz.company.dao.CompanyDAO;


public class CompanyRunner {

	public static void main(String[] args) {
		CompanyEntity ce = new CompanyEntity(1, "capgemini", "java developer", "servicebased", "xworkz");
		CompanyDAO dao = new CompanyDAOImpl();
		dao.create(ce);
	}

}
